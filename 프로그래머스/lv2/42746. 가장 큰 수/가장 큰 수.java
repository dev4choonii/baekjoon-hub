import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        int numbersLength = numbers.length;

        String[] numberStrArray = new String[numbersLength];
        for (int i = 0; i < numbersLength; i++) {
            numberStrArray[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numberStrArray, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        String answer = numberStrArray[0].equals("0") ? "0" : String.join("", numberStrArray);
        return answer;
    }
}