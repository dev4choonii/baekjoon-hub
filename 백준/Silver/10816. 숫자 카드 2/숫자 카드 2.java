import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            StringTokenizer cardInput = new StringTokenizer(br.readLine());

            Map<Integer, Integer> possessionCardMap = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int cardNumber = Integer.parseInt(cardInput.nextToken());
                possessionCardMap.put(cardNumber, possessionCardMap.getOrDefault(cardNumber, 0)+1);
            }

            int M = Integer.parseInt(br.readLine());
            StringTokenizer cardDeckInput = new StringTokenizer(br.readLine());

            int[] cardDeck = new int[M];
            for (int i = 0; i < M; i++) {
                int cardNumber = Integer.parseInt(cardDeckInput.nextToken());
                cardDeck[i] = cardNumber;
            }

            for (Integer cardNumber : cardDeck) {
                sb.append(Optional.ofNullable(possessionCardMap.get(cardNumber)).orElse(0)).append(" ");
            }

            bw.write(sb.toString());
            bw.flush();
        }
    }
}