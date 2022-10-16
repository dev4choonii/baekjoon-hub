import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int n = Integer.parseInt(br.readLine());
            List<Point> points = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                StringTokenizer input = new StringTokenizer(br.readLine());
                points.add(Point.of(Integer.parseInt(input.nextToken()), Integer.parseInt(input.nextToken())));
            }

            Collections.sort(points);

            for (Point point : points) {
                sb.append(point.getX()).append(" ").append(point.getY()).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }

}
class Point implements Comparable<Point> {
    private final int x;
    private final int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.y != o.y) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}
