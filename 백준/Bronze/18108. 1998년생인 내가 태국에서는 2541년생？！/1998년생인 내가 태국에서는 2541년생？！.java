import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int minusYear = 543;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int thailandYear = Integer.valueOf(br.readLine());
        
        System.out.println(thailandYear-minusYear);
    }
}
