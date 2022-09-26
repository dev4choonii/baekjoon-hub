import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            StringTokenizer numberInput = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(br.readLine());
            StringTokenizer findNumber = new StringTokenizer(br.readLine());

            int[] numberArray = new int[N];
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = Integer.parseInt(numberInput.nextToken());
            }

            Arrays.sort(numberArray);

            for (int i = 0; i < M; i++) {
                int n = Integer.parseInt(findNumber.nextToken());
                sb.append(Arrays.binarySearch(numberArray, n) >= 0 ? 1 : 0).append("\n");
            }

            bw.write(sb.toString());
            bw.flush();
        }
    }
}