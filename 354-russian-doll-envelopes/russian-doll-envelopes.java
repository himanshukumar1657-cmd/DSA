
import java.util.*;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int n = envelopes.length;

        int[] tails = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {

            int height = envelopes[i][1];

            int left = 0;
            int right = size;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (tails[mid] >= height) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            tails[left] = height;

            if (left == size) {
                size++;
            }
        }

        return size;
    }
}
