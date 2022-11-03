import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int number = Integer.parseInt(br.readLine());
            int cycleCount = 1;
            int tempNumber = number;
            while (true) {
                int number1 = tempNumber / 10;
                int number2 = tempNumber % 10;
                int sum = (number1 + number2) % 10;
                int cycleNumber = Integer.parseInt(String.valueOf(number2) + sum);

                if (number == cycleNumber) {
                    break;
                }

                tempNumber = cycleNumber;
                cycleCount++;
            }

            sb.append(cycleCount);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}