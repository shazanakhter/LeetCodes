import java.util.*;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        
        // Map number -> sorted list of indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }

        int minDis = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int r = reverse(nums[i]);
            if (!map.containsKey(r)) continue;

            // list of all positions j where nums[j] == r
            List<Integer> list = map.get(r);

            // Find first j > i via binary search
            int j = firstGreater(list, i);
            if (j != -1) {
                minDis = Math.min(minDis, j - i);
            }
        }

        return minDis == Integer.MAX_VALUE ? -1 : minDis;
    }

    private int firstGreater(List<Integer> list, int i) {
        int left = 0, right = list.size() - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (list.get(mid) > i) {
                ans = list.get(mid);
                right = mid - 1;  // try to find smaller j
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private int reverse(int num) {
        int r = 0;
        while (num > 0) {
            r = r * 10 + num % 10;
            num /= 10;
        }
        return r;
    }
}
