import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer info = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(info.nextToken());
            String checkNumber = info.nextToken();

            int result = 0;
            for (int i = 1; i <= size; i++) {
                String[] numberArray = String.valueOf(i).split("");
                for (String number : numberArray) {
                    if (number.equals(checkNumber)) {
                        result++;
                    }
                }
            }

            sb.append(result);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}