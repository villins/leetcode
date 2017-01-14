import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Villins on 17/1/13.
 */
public class Solution {
    public int integerBreak(int n) {
        /** math
        if(n < 4){
            return n - 1;
        }

        if(n == 4) {
            return 4;
        }

        int result = 1;
        while(n > 4) {
            result = result * 3;
            n = n - 3;
         }

        return result * n
         */

        // dp
        List<Integer> list = new ArrayList<>(n);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i = 4; i <= n; i++) {
            int x = list.get(i - 2) * 2;
            int y = list.get(i - 3) * 3;
            list.add(max(x, y));
        }
        return list.get(n);
    }

    private int max(int x, int y) {
        if(x > y) {
            return x;
        }
        return y;
    }
}

