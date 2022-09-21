import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long inputNumber = Long.parseLong(br.readLine());
        long factorial = factorial(inputNumber);

        System.out.print(factorial);
    }

    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        }

        return factorial(n-1) * n;
    }
}