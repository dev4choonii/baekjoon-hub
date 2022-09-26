import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        try (br; bw) {
            StringBuilder sb = new StringBuilder();

            List<ConferenceReservation> conferenceReservations = new ArrayList<>();

            int conferenceCount = Integer.parseInt(br.readLine());
            for (int i = 0; i < conferenceCount; i++) {
                StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
                int startTime = Integer.parseInt(stringTokenizer.nextToken());
                int endTime = Integer.parseInt(stringTokenizer.nextToken());

                conferenceReservations.add(new ConferenceReservation(startTime, endTime));
            }

            conferenceReservations.sort((o1, o2) -> {
                if (o1.getEndTime() == o2.getEndTime()) {
                    return o1.getStartTime() - o2.getStartTime();
                }
                return o1.getEndTime() - o2.getEndTime();
            });

            int totalUsableConferenceRoomCount = 0;
            int preEndTime = 0;
            for (int i = 0; i < conferenceReservations.size(); i++) {
                ConferenceReservation conferenceReservation = conferenceReservations.get(i);
                if (preEndTime <= conferenceReservation.getStartTime()) {
                    preEndTime = conferenceReservation.getEndTime();
                    totalUsableConferenceRoomCount++;
                }
            }

            sb.append(totalUsableConferenceRoomCount);

            bw.write(sb.toString());
            bw.flush();
        }
    }

    static class ConferenceReservation {
        private int startTime;
        private int endTime;

        public ConferenceReservation(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public int getEndTime() {
            return endTime;
        }
    }
}