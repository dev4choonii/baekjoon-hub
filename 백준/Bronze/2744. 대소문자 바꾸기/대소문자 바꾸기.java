import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            String word = br.readLine();
            char[] wordCharArray = word.toCharArray();
            for (int i = 0; i < wordCharArray.length; i++) {
                if (Character.isLowerCase(wordCharArray[i])) {
                    wordCharArray[i] = Character.toUpperCase(wordCharArray[i]);
                } else {
                    wordCharArray[i] = Character.toLowerCase(wordCharArray[i]);
                }
            }

            sb.append(wordCharArray);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}