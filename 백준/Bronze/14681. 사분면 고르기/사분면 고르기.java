import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        boolean xPositive = x > 0;
        boolean yPositive = y > 0;

        int answer = 0;
        if (xPositive && yPositive) {
            answer = 1;
        } else if (!xPositive && yPositive) {
            answer = 2;
        } else if (!xPositive && !yPositive) {
            answer = 3;
        } else if (xPositive && !yPositive) {
            answer = 4;
        }

        System.out.println(answer);
    }
}