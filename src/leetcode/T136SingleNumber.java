/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T136SingleNumber.java 2020/05/14 14:04 MessiahJK
 */
public class T136SingleNumber {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
