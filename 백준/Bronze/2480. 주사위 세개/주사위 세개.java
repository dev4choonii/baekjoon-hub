import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        Map<Integer, Integer> gameResultsMap = new HashMap<>();
        while (stringTokenizer.hasMoreTokens()) {
            Integer key = Integer.valueOf(stringTokenizer.nextToken());
            int count = gameResultsMap.getOrDefault(key, 0);
            gameResultsMap.put(key, ++count);
        }

        List<Map.Entry<Integer, Integer>> gameResults = new LinkedList<>(gameResultsMap.entrySet());
        gameResults.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map.Entry<Integer, Integer> result = gameResults.get(0);
        if (result.getValue() == 1) {
            gameResults.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
            result = gameResults.get(0);
        }

        int money = Rules.calculateMoney(result);

        System.out.println(money);
    }

    enum Rules {

        COUNT_3(3, n -> 10000 + n * 1000),
        COUNT_2(2, n -> 1000 + n * 100),
        COUNT_1(1, n -> n * 100);

        private final Integer count;
        private final Function<Integer, Integer> calculate;

        Rules(Integer count, Function<Integer, Integer> calculate) {
            this.count = count;
            this.calculate = calculate;
        }

        public Integer getCount() {
            return count;
        }

        private static Optional<Rules> getRule(Integer count) {
            return Arrays.stream(Rules.values())
                    .filter(rule -> rule.getCount().equals(count))
                    .findFirst();
        }

        public static Integer calculateMoney(Map.Entry<Integer, Integer> gameResult) {
            Optional<Rules> rule = getRule(gameResult.getValue());
            return rule.isPresent() ? rule.get().calculate.apply(gameResult.getKey()) : 0;
        }
    }
}