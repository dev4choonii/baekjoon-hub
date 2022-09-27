import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                numbers.add(Integer.parseInt(stringTokenizer.nextToken()));
            }

            sb.append(Collections.min(numbers)).append(" ").append(Collections.max(numbers));

            bw.write(sb.toString());
            bw.flush();
        }
    }
}