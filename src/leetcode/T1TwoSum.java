/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MessiahJK
 * @version : T1TwoSum.java 2020/05/07 22:41 MessiahJK
 */
public class T1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>(16);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                result[0]=map.get(nums[i]);
                result[1]=i;
                return result;
            }
            map.put(target-nums[i],i);
        }
        return result;
    }
}
