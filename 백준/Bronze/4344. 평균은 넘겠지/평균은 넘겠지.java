import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int c = Integer.parseInt(br.readLine());
            for (int i = 0; i < c; i++) {
                StringTokenizer input = new StringTokenizer(br.readLine());
                int studentCount = Integer.parseInt(input.nextToken());
                int[] studentPointArray = new int[studentCount];
                int total = 0;

                for (int j = 0; j < studentCount; j++) {
                    int point = Integer.parseInt(input.nextToken());
                    studentPointArray[j] = point;
                    total += point;
                }

                double avg = (double) total / studentCount;
                int result = 0;
                for (int studentPoint : studentPointArray) {
                    if (studentPoint > avg) {
                        ++result;
                    }
                }

                sb.append(String.format("%.3f", (double) result / studentCount * 100)).append("%").append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}