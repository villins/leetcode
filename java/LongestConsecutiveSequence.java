import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int len = 0;
        for(int num : nums) {

            if(set.contains(num)) {
                int down = num;
                int up = num;
                int l = 1;
                while (set.contains(++up)) {
                    l++;
                    set.remove(up);
                }

                while (set.contains(--down)) {
                    l++;
                    set.remove(down);
                }

                set.remove(num);

                if(l > len) {
                    len = l;
                }
            }
        }

        return len;
    }
}
