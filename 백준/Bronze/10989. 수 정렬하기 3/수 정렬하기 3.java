import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            int numberCount = Integer.parseInt(br.readLine());

            int[] nums = new int[10001];
            for (int i=0; i<numberCount; i++) {
                nums[Integer.parseInt(br.readLine())]++;
            }

            for (int i=1; i<10001; i++) {
                while (nums[i] > 0) {
                    sb.append(i).append("\n");
                    nums[i]--;
                }
            }

            bw.write(sb.toString());
            bw.flush();
        }
    }
}