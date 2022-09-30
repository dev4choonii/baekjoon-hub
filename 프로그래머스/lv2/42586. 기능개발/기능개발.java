import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        final int completed = 100;
        //code

        /*
        선입선출로 Queue
        앞 기능 완료 가능한 일수
        앞 기능 완료 일수를 가지고 뒤에 일수를 체크하여 뒷기능 일수가 앞 일수보다 작으면 묶어서 배포(요소 추가)
         */

        int[] needDays = new int[progresses.length];
        for (int i = 0; i<progresses.length; i++) {
            int needDay = (int) Math.ceil((double) (completed - progresses[i]) / speeds[i]);
            needDays[i] = needDay;
        }

        List<Integer> deploys = new ArrayList<>();
        int pre = needDays[0];
        int count = 1;
        for (int i = 1; i < needDays.length; i++) {
            int needDay = needDays[i];
            if (pre < needDay) {
                deploys.add(count);
                count = 1;
                pre = needDay;
            } else {
                count++;
            }
        }
        
        deploys.add(count);

        //////////////////////////////

        return deploys.stream().mapToInt(Integer::intValue).toArray();
    }
}