import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int tempDefault = tempMap.getOrDefault(nums[i], 0);
            tempMap.put(nums[i], ++tempDefault);
        }
        
        int phoneketmonCount = tempMap.keySet().size();
        answer = phoneketmonCount > nums.length / 2 ? nums.length / 2 : phoneketmonCount;
        
        return answer;
    }
}