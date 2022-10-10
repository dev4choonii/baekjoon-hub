import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer numbers = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(numbers.nextToken());
            BigInteger b = new BigInteger(numbers.nextToken());
            BigInteger sum = a.add(b);

            sb.append(sum);


            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}