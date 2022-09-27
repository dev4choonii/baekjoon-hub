import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

            int firstNumber = Integer.parseInt(stringTokenizer.nextToken());
            int max = firstNumber;
            int min = firstNumber;
            for (int i = 1; i < N; i++) {
                int number = Integer.parseInt(stringTokenizer.nextToken());

                max = Math.max(max, number);
                min = Math.min(min, number);
            }

            sb.append(min).append(" ").append(max);

            bw.write(sb.toString());
            bw.flush();
        }
    }
}