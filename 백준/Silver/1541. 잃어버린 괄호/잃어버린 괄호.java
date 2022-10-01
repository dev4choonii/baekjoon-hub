import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();

            // code

            int result = 0;
            String[] strSplit = br.readLine().split("-");
            for (int i = 0; i < strSplit.length; i++) { // i <= stringTokenizer.countTokens(); -> nextToken으로 토큰이 사라지기 때문에 <=로. 사실은 while 써야지..
                int temp = summary(strSplit[i]);

                if (i == 0) {
                    result += temp;
                } else {
                    result -= temp;
                }
            }

            sb.append(result);

            bw.write(sb.toString());
            bw.flush();
        }
    }

    static int summary(String str) {
        int sum = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(str, "+");
        while (stringTokenizer.hasMoreTokens()) {
            sum += Integer.parseInt(stringTokenizer.nextToken());
        }

        return sum;
    }
}