import java.util.*;

public class Solution {
    public String largestString(String[] nums){
        Comparator <String> comparator = (a,b) -> (b+a).compareTo(a+b);
        Arrays.sort(nums,comparator);
        if(nums[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(String num : nums){
            sb.append(num);
        }
        return sb.toString();
    }

}
