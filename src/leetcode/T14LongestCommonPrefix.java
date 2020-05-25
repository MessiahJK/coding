/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T14LongestCommonPrefix.java 2020/05/25 16:50 MessiahJK
 */
public class T14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length<=0){
            return "";
        }
        int theMinLength=Integer.MAX_VALUE;
        for(String str : strs){
            theMinLength=Math.min(theMinLength,str.length());
        }
        for(int i=0;i<theMinLength;i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(ch!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,theMinLength);
    }
}
