import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            Stack<Character> stack = new Stack<>();

            int n = Integer.parseInt(br.readLine());

            boolean[] resultArray = new boolean[n];
            Arrays.fill(resultArray, true);

            for (int i = 0; i < n; i++) {
                String syntaxes = br.readLine();
                for (int j = 0; j < syntaxes.length(); j++) {
                    char syntax = syntaxes.charAt(j);
                    if ('(' == syntax) {
                        stack.push(syntax);
                    } else if (')' == syntax) {
                        if (stack.empty()) {
                            resultArray[i] = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    }
                }

                if (!stack.empty()) {
                    resultArray[i] = false;
                }

                stack.clear();
            }

            for (boolean result : resultArray) {
                sb.append(result ? "YES" : "NO").append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}