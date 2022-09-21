import java.io.*;
import java.util.*;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) throws IOException {
        final int adjustMinutes = 45;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hours = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        LocalTime localTime = LocalTime.of(hours, minutes);
        LocalTime adjustTime = localTime.minusMinutes(adjustMinutes);

        System.out.println(adjustTime.getHour());
        System.out.println(adjustTime.getMinute());
    }
}