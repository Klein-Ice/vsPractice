import java.util.*;

public class _huawei0506 {
    /**
     * 问题描述:←
给定一个整数数组A，请将其划分为三个和相等的非空部分，按原数组中的顺序依次输出三个非空数组。如果不能等分，请输出三个空数组。←
5形式上，如果我们可以找出索引i+1<j且满足(A[0]+ A[1]+ … + A[i])==(A[i+1]+ A[i+2]+…+A[j-1])==(A[j]+ A[j+1]+…+ A[A.length-1])就可以将数组三等分←
K
示例 1k
I
输入:[0，2，1，-6，6，-7，9，1，2，0，1]输出:[0，2，1]，[-6，6，-7，9，1，[2，0，1]K
示例 2←
输入:[0，2，1，-6，6，-7，9，-1，2，0，1]输出:[]，[]，[]<
     */

     public List<List<Integer>> ThreeAddNums(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int[][] arrs = new int[3][];
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        System.out.println(sum);
        if(sum%3!=0) {
            return null;
        }
        int sum1=0;
        int sum2 =0;
        int sum3 =0;
        for(int i = 0;i<n;i++){
            sum1 += nums[i];
            for(int j =i;j<n;j++){
                sum2 += nums[j];
                sum3 = sum-sum1-sum2;
                if(sum1==sum2 &&sum1==sum3){
                    for(int x = 0;x<i;x++){
                        list2.add(nums[x]);
                    }
                    for(int y =i;y<j;y++){
                        list2.add(nums[y]);
                    }
                    for(int z = j;z<n;z++){
                        list2.add(nums[z]);
                    }
                }
            }

        }
        list.add(list2);
        System.out.println(list);
        return list;

     }

     public int[][] splitArray(int[] A) {
        int total = Arrays.stream(A).sum();
        int n = A.length;
        // 总和无法被3整除或数组长度小于3，直接返回三个空数组
        if (total % 3 != 0 || n < 3) {
            return new int[][]{{}, {}, {}};
        }
        
        int target = total / 3;
        int firstEnd = -1, secondEnd = -1;
        int currentSum = 0;
        
        // 寻找第一个分割点
        for (int i = 0; i < n; i++) {
            currentSum += A[i];
            if (currentSum == target) {
                firstEnd = i;
                break;
            }
        }
        // 分割点i之后必须至少有两个元素
        if (firstEnd == -1 || firstEnd >= n-2) {
            return new int[][]{{}, {}, {}};
        }
        
        // 寻找第二个分割点
        currentSum = 0;
        for (int j = firstEnd+1; j < n; j++) {
            currentSum += A[j];
            if (currentSum == target) {
                secondEnd = j;
                break;
            }
        }
        // 分割点j之后必须至少有一个元素
        if (secondEnd == -1 || secondEnd >= n-1) {
            return new int[][]{{}, {}, {}};
        }
        
        // 构造结果
        int[] part1 = Arrays.copyOfRange(A, 0, firstEnd+1);
        int[] part2 = Arrays.copyOfRange(A, firstEnd+1, secondEnd+1);
        int[] part3 = Arrays.copyOfRange(A, secondEnd+1, n);
        return new int[][]{part1, part2, part3};
    }


}
