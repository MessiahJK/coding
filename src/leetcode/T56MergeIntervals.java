/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author MessiahJK
 * @version : T56MergeIntervals.java 2020/07/14 16:10 MessiahJK
 */
public class T56MergeIntervals {
    public int[][] merge(int[][] intervals){
        List<int[]> res=new ArrayList<>();
        if(intervals == null || intervals.length == 0){
            return res.toArray(new int[0][]);
        }
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int i=0;
        while(i<intervals.length){
            int left=intervals[i][0];
            int right=intervals[i][1];
            while(i<intervals.length-1 && intervals[i+1][0]<=right){
                i++;
                right=Math.max(right,intervals[i][1]);
            }
            res.add(new int[]{left,right});
            i++;
        }
        return res.toArray(new int[0][]);
    }
}