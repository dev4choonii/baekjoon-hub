import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            StringTokenizer inputTime = new StringTokenizer(br.readLine());

            List<AccountHolder> accountHolders = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                accountHolders.add(new AccountHolder(i, Integer.parseInt(inputTime.nextToken())));
            }

            accountHolders.sort(Comparator.comparingInt(AccountHolder::getUseTime));

            for (int i = 0; i < accountHolders.size(); i++) {
                if (i == 0) {
                    accountHolders.get(i).setWaitTime(accountHolders.get(i).getUseTime());
                    continue;
                }

                accountHolders.get(i).setWaitTime(accountHolders.get(i-1).getWaitTime() + accountHolders.get(i).getUseTime());
            }

            int totalTime = 0;
            for (AccountHolder accountHolder : accountHolders) {
                totalTime += accountHolder.getWaitTime();
            }

            sb.append(totalTime);

            bw.write(sb.toString());
            bw.flush();
        }
    }

    static class AccountHolder {
        private int id;
        private int useTime;
        private int waitTime;

        public AccountHolder(int id, int useTime) {
            this.id = id;
            this.useTime = useTime;
        }

        public int getId() {
            return id;
        }

        public int getUseTime() {
            return useTime;
        }

        public int getWaitTime() {
            return waitTime;
        }

        public void setWaitTime(int waitTime) {
            this.waitTime = waitTime;
        }
    }
}