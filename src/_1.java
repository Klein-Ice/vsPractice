import java.util.*;

public class _1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(target == nums[i]+nums[j]){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }

    public int[] twoSum_map(int[] nums,int target){
        int n = nums.length;
        int[] res = new int[2];
        if(nums==null||nums.length==0) return res;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[1] =i;
                res[0] = map.get(temp);
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }

}
