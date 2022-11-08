class Solution {
    public int solution(int n) {
        char[] numberArray = String.valueOf(n).toCharArray();

        int answer = 0;
        for (char number : numberArray) {
            answer += Character.getNumericValue(number);
        }

        return answer;
    }
}