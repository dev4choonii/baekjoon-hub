import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer input = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(input.nextToken());
            int m = Integer.parseInt(input.nextToken());

            int[][] result = new int[n][m];
            StringTokenizer rowArray;

            for (int i = 0; i < n; i++) {
                rowArray = new StringTokenizer(br.readLine());
                int rowArrayCount = rowArray.countTokens();
                for (int j = 0; j < rowArrayCount; j++) {
                    result[i][j] += Integer.parseInt(rowArray.nextToken());
                }
            }

            for (int i = 0; i < n; i++) {
                rowArray = new StringTokenizer(br.readLine());
                int rowArrayCount = rowArray.countTokens();
                for (int j = 0; j < rowArrayCount; j++) {
                    result[i][j] += Integer.parseInt(rowArray.nextToken());
                    sb.append(result[i][j]).append(" ");
                }
                sb.append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}