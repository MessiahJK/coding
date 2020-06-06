/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author MessiahJK
 * @version : T128LongestConsecutiveSequence.java 2020/06/06 23:32 MessiahJK
 */
public class T128LongestConsecutiveSequence {
    private Map<Integer,Integer> map =new HashMap<>();

    private int find(int x){
        if(map.containsKey(x)){
            int value=find(map.get(x));
            map.put(x,value);
            return value;
        }else{
            return x;
        }
    }
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int longest=0;
        for(int num : nums){
            map.put(num,num+1);
        }
        for(int num : nums){
            int last = find(num);
            longest = Math.max(longest,last-num);
        }
        return longest;
    }

    public int longestConsecutive1(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Set<Integer> set=new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest=0,currect=1,last=Integer.MIN_VALUE;
        for(int num : set){
            if(num != last +1){
                longest=Math.max(longest,currect);
                currect = 1;
            } else {
                currect += 1;
            }
            last = num;
        }
        longest=Math.max(longest,currect);
        return longest;
    }
}
