import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            // code

            Integer n = Integer.valueOf(br.readLine());
//            Integer[] numArray = new Integer[n];
            List<Integer> nums = new LinkedList<>();

            for (int i=0; i<n; i++) {
                nums.add(Integer.valueOf(br.readLine()));
            }

//            Arrays.sort(numArray);
            Collections.sort(nums);
            
            for (Integer num : nums) {
                sb.append(num + "\n");
            }

            ////////////////////

            bw.write(sb.toString());
            bw.flush();
        }
    }
}





