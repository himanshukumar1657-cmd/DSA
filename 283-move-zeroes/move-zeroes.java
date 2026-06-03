class Solution {
    public void moveZeroes(int[] nums) {
        int point1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[point1] = nums[i];
                point1++;
            }
        }
        while (point1 < nums.length) {
            nums[point1] = 0;
            point1++;
        }

    }
}