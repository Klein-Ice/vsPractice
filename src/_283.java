public class _283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while (j < n) {
            while (i < n && nums[i] == 0)
                i++;
            while (j < n && nums[j] != 0)
                j++;
            swap(nums, i, j);
        }
        System.out.println(nums.toString());
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
