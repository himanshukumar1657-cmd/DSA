class Solution {

    int[] nums;
    int[] temp;
    int[] count;
    int[] index;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        this.nums = nums;
        temp = new int[n];
        count = new int[n];
        index = new int[n];

        for (int i = 0; i < n; i++)
            index[i] = i;

        mergeSort(0, n - 1);

        List<Integer> ans = new ArrayList<>();

        for (int x : count)
            ans.add(x);

        return ans;
    }

    void mergeSort(int left, int right) {

        if (left >= right)
            return;

        int mid = left + (right - left) / 2;

        mergeSort(left, mid);
        mergeSort(mid + 1, right);

        merge(left, mid, right);
    }

    void merge(int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = left;
        int smaller = 0;

        while (i <= mid && j <= right) {

            if (nums[index[j]] < nums[index[i]]) {

                smaller++;
                temp[k++] = index[j++];

            } else {

                count[index[i]] += smaller;
                temp[k++] = index[i++];
            }
        }

        while (i <= mid) {

            count[index[i]] += smaller;
            temp[k++] = index[i++];
        }

        while (j <= right)
            temp[k++] = index[j++];

        for (int x = left; x <= right; x++)
            index[x] = temp[x];
    }
}