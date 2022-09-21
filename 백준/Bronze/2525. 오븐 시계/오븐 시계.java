import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] currentTime = br.readLine().split(" ");

        Integer hours = Integer.valueOf(currentTime[0]);
        Integer minutes = Integer.valueOf(currentTime[1]);
        Integer cookingTime = Integer.valueOf(br.readLine());

        LocalTime completedTime = LocalTime.of(hours, minutes).plusMinutes(cookingTime);
        Integer completedTimeHour = completedTime.getHour();
        Integer completedTimeMinute = completedTime.getMinute();
        
        System.out.printf("%d %d", completedTimeHour, completedTimeMinute);
    }
}