/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T674LongestContinuousIncreasingSubsequence.java 2020/05/31 1:46 MessiahJK
 */
public class T674LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int res=0;
        int temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                temp++;
            }else{
                res=Math.max(temp,res);
                temp=1;
            }
        }
        res=Math.max(temp,res);
        return res;
    }
}
