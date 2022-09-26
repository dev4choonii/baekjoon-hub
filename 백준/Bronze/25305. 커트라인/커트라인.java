import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            // code

            StringTokenizer countInput = new StringTokenizer(br.readLine());
            Integer studentCount = Integer.valueOf(countInput.nextToken());
            Integer winnerCount = Integer.valueOf(countInput.nextToken());

            StringTokenizer pointInput = new StringTokenizer(br.readLine());
            List<Integer> points = new LinkedList<>();
            for (int i=0; i<studentCount; i++) {
                points.add(Integer.parseInt(pointInput.nextToken()));
            }

            points.sort(Collections.reverseOrder());

            sb.append(points.get(winnerCount-1));


            ////////////////////

            bw.write(sb.toString());
            bw.flush();
        }
    }
}