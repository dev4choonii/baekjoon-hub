import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int n = Integer.parseInt(br.readLine());
            StringTokenizer points = new StringTokenizer(br.readLine());

            double[] pointArray = new double[n];
            pointArray[0] = Integer.parseInt(points.nextToken());
            double maxPoint = pointArray[0];

            for (int i = 1; i < n; i++) {
                pointArray[i] = Integer.parseInt(points.nextToken());
                maxPoint = Math.max(maxPoint, pointArray[i]);
            }

            double sum = 0;
            for (int i = 0; i < pointArray.length; i++) {
                pointArray[i] = pointArray[i] / maxPoint * 100;
                sum += pointArray[i];
            }

            sb.append(sum / n);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}