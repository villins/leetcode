public class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }

        int left = 0, right = A.length - 1;
        boolean isLeft = false, isRight = false;
        for (; left != right;) {
            if (A[left] < A[left + 1]) {
                left++;
            } else {
                isLeft = true;
            }

            if (A[right] < A[right - 1]) {
                right--;
            } else {
                isRight = true;
            }

            if (left == A.length - 1 || right == 0) {
                return false;
            }
            else if (left == right) {
                return true;
            } else if (isLeft && isRight && right != left) {
                return false;
            }
        }

        return false;
    }
}

