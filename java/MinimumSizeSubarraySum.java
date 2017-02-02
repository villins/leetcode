public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int j = -1;
        int sum = 0;
        int len = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum >= s) {
                while (sum >= s) {
                    j += 1;
                    sum = sum - nums[j];
                }
                if(i - j < len || len == 0){
                    len = i - j + 1;
                }
            }
        }

        return len;
    }
}
