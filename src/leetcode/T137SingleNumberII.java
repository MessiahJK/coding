/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T137SingleNumberII.java 2020/05/14 14:22 MessiahJK
 */
public class T137SingleNumberII {

    public int singleNumber(int[] nums) {
        int a=0,b=0;
        for(int num : nums){
            a = (a ^ num) & ~b;
            b = (b ^ num) & ~a;
        }
        return a;
    }

    public int singleNumber1(int[] nums) {
        int result=0;
        for(int i=0;i<32;i++){
            int temp=0;
            for(int num:nums){
                temp+=(num>>i)&1;
            }
            result+=(temp%3)<<i;
        }
        return result;
    }
}
