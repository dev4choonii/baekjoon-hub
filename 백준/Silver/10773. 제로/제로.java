import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            Stack<Integer> stack = new Stack<>();

            int sumData = 0;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                int data = Integer.parseInt(br.readLine());
                if (data == 0) {
                    if (!stack.isEmpty()) {
                        int popData = stack.pop();
                        sumData -= popData;
                    }
                } else {
                    stack.push(data);
                    sumData += data;
                }
            }

            sb.append(sumData);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}