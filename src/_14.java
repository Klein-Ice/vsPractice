public class _14 {
    // 最长公共前缀
    public String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String preString = strs[0];
        int n = strs.length;
        for(int i = 0;i<n;i++){
            preString = longestCommonPrefix(preString, strs[i]);
            if(preString.length() == 0) return "";
        } 

        return preString;

    }

    public String longestCommonPrefix(String str1,String str2){
        int pre = 0;
        int maxLength  = Math.min(str1.length(),str2.length());
        for(int i= 0;i<maxLength;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                pre++;
            }else{
                break;
            }
        }
        return str1.substring(0, pre);
    }

}
