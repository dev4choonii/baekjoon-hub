import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long inputNumber = Long.parseLong(br.readLine());
        long fibonacci = fibonacci(inputNumber);

        System.out.print(fibonacci);
    }

    static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}