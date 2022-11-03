import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            final int total = 30;
            final int submissionCount = 28;

            int[] submissionArray = new int[total+1];
            for (int i = 0; i < submissionCount; i++) {
                int id = Integer.parseInt(br.readLine());
                submissionArray[id] = 1;
            }

            for (int i = 1; i < submissionArray.length; i++) {
                if (submissionArray[i] == 0) {
                    sb.append(i).append("\n");
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}