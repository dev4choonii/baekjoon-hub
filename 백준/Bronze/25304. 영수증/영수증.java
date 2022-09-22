
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer totalPrice = Integer.valueOf(br.readLine());
        Integer n = Integer.valueOf(br.readLine());

        int calculatePrice = 0;
        for (int i=0; i<n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(stringTokenizer.nextToken());
            int qty = Integer.parseInt(stringTokenizer.nextToken());

            calculatePrice += price * qty;
        }

        System.out.println(totalPrice == calculatePrice ? "Yes" : "No");
    }
}