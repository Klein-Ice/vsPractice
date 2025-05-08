public class _35 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            int mid  = (j-i)/2 +i;
            if(nums[mid] < target){
                i = mid+1;
            }else if(nums[mid]>target){
                j = mid -1;
            }else if(nums[mid] == target){
                return mid;
            }
        }
        return i;
        
    }
}
