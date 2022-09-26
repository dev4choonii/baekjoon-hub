import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            String numberStr = br.readLine();
            char[] numberCharArray = numberStr.toCharArray();

            Arrays.sort(numberCharArray);

            for (int i=numberCharArray.length-1; i>=0; i--) {
                sb.append(numberCharArray[i]);
            }

            bw.write(sb.toString());
            bw.flush();
        }
    }
}