import java.util.Arrays;

public class _169 {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // 手撕快排
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        return nums[nums.length / 2];
    }

    public void quickSort(int[] nums, int left, int right) {
        if (nums == null)
            return;
        if (left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, left, pivot - 1);
            quickSort(nums, pivot + 1, right);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivotvalue = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && nums[j] >= pivotvalue)
                j--;
            while (i < j && nums[i] <= pivotvalue)
                i++;
            if (i < j)
                swap(nums, i, j);
        }
        swap(nums, left, i);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
