import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int n = Integer.parseInt(br.readLine());
            String[] wordArray = new String[n];
            for (int i = 0; i < n; i++) {
                wordArray[i] = br.readLine();
            }

            Arrays.sort(wordArray, (o1, o2) -> {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }
                return o1.compareTo(o2);
            });

            String preWord = wordArray[0];
            sb.append(preWord).append("\n");

            for (int i = 1; i < wordArray.length; i++) {
                if (!preWord.equals(wordArray[i])) {
                    sb.append(wordArray[i]).append("\n");
                }

                preWord = wordArray[i];
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}