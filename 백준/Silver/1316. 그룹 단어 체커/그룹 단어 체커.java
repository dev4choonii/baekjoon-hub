import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (int i = 0; i < n; i++) {
                String line = br.readLine();

                StringBuilder distinctSB = new StringBuilder();
                distinctSB.append(line.charAt(0));

                char[] lineCharArray = line.toCharArray();
                for (int j = 1; j < lineCharArray.length; j++) {
                    if (lineCharArray[j-1] != lineCharArray[j]) {
                        distinctSB.append(lineCharArray[j]);
                    }
                }

                String distinctLine = distinctSB.toString();
                Set<Character> tempSet = new HashSet<>();
                tempSet.add(distinctLine.charAt(0));

                boolean isGroupWord = true;
                for (int j = 1; j < distinctLine.length(); j++) {
                    if (tempSet.contains(distinctLine.charAt(j))) {
                        isGroupWord = false;
                        break;
                    }

                    tempSet.add(distinctLine.charAt(j));
                }

                if (isGroupWord) {
                    count++;
                }
            }

            sb.append(count);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}