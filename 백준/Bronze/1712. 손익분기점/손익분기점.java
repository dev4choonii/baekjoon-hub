import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer moneyInput = new StringTokenizer(br.readLine());
            int fixed = Integer.parseInt(moneyInput.nextToken());
            int variable = Integer.parseInt(moneyInput.nextToken());
            int price = Integer.parseInt(moneyInput.nextToken());

            long breakEvenPoint = 0;
            if (variable >= price) {
                breakEvenPoint = -1;
            } else {
                long totalCost = fixed;
                long totalSalesCost = 0;
                while (totalCost >= totalSalesCost) {
                    ++breakEvenPoint;
                    totalCost += variable;
                    totalSalesCost += price;
                }
            }

            sb.append(breakEvenPoint);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}