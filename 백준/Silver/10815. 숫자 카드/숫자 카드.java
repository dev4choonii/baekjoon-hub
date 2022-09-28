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
            StringTokenizer nInput = new StringTokenizer(br.readLine());
            int[] nArray = new int[N];
            for (int i = 0; i < N; i++) {
                nArray[i] = Integer.parseInt(nInput.nextToken());
            }

            int M = Integer.parseInt(br.readLine());
            StringTokenizer mInput = new StringTokenizer(br.readLine());
            int[] mArray = new int[M];
            for (int i = 0; i < M; i++) {
                mArray[i] = Integer.parseInt(mInput.nextToken());
            }

            Arrays.sort(nArray);

            for (int m : mArray) {
                int found = Arrays.binarySearch(nArray, m);
                sb.append(found >= 0 ? 1: 0).append(" ");
            }

            bw.write(sb.toString());
            bw.flush();
        }
    }
}