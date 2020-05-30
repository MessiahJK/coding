/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

import java.util.Arrays;

/**
 * @author MessiahJK
 * @version : T567PermutationInString.java 2020/05/31 0:14 MessiahJK
 */
public class T567PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1==null||s1.length()<=0||s2==null||s2.length()<=0){
            return false;
        }
        if(s1.length()>s2.length()){
            return false;
        }
        int[] s1Nums=new int[30];
        int[] s2Nums=new int[30];
        for(int i=0;i<s1.length();i++){
            s1Nums[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            s2Nums[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1Nums,s2Nums)){
            return true;
        }
        for(int i=0;i<s2.length()-s1.length();i++){
            s2Nums[s2.charAt(i)-'a']--;
            s2Nums[s2.charAt(i+s1.length())-'a']++;
            if(Arrays.equals(s1Nums,s2Nums)){
                return true;
            }
        }
        return false;
    }

}
