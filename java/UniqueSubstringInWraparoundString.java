import java.util.*;

/**
 * Created by Villins on 17/1/13.
 */
public class Solution {
    public int findSubstringInWraproundString(String p) {
        int[] counts = new int[26];
        char[] chars = p.toCharArray();
        int maxLength = 0;
        for(int i = 0; i < chars.length; i++) {
            if(i > 0 && (chars[i] - chars[i-1] == 1 || chars[i] - chars[i-1] == -25)) {
                maxLength += 1;
            } else {
                maxLength = 1;
            }

            counts[chars[i] - 'a'] = Math.max(counts[chars[i] - 'a'], maxLength);
        }

        int result = 0;
        for(int count : counts) {
            result += count;
        }
        return result;
    }
}
