import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer info = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(info.nextToken());
            String type = info.nextToken();

            Set<String> users = new HashSet<>();
            for (int i = 0; i < n; i++) {
                users.add(br.readLine());
            }

            int result = users.size() / (Game.getGameUserCount(type) - 1) ;
            sb.append(result);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }

    enum Game {
        Y(2),
        F(3),
        O(4);

        final int userCount;

        Game(int userCount) {
            this.userCount = userCount;
        }

        public static int getGameUserCount(String type) {
            return Arrays.stream(Game.values())
                    .filter(game -> game.name().equals(type))
                    .findFirst()
                    .get().userCount;
        }
    }
}