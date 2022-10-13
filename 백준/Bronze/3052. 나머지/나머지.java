import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            Map<Integer, Integer> resultMap = new HashMap<>();

            final int b = 42;
            for (int i = 0; i < 10; i++) {
                int a = Integer.parseInt(br.readLine());
                int remainder = a % b;
                resultMap.put(remainder, resultMap.getOrDefault(remainder, 0) + 1);
            }

            sb.append(resultMap.keySet().size());

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}