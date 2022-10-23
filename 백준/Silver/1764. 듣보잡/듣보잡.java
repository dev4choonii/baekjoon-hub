import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer input = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(input.nextToken());
            int m = Integer.parseInt(input.nextToken());

            Map<String, Integer> userMap = new HashMap<>();
            for (int i = 0; i < (n + m); i++) {
                String name = br.readLine();
                userMap.put(name, userMap.getOrDefault(name, 0) + 1);
            }

            Set<Map.Entry<String, Integer>> entries = userMap.entrySet();
            List<String> result = new ArrayList<>();
            entries.stream()
                    .filter(e -> e.getValue() == 2)
                    .forEach(e -> result.add(e.getKey()));

            Collections.sort(result);

            sb.append(result.size()).append("\n");

            for (String s : result) {
                sb.append(s).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}