/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T151reverseWordsInAString.java 2020/05/31 1:05 MessiahJK
 */
public class T151reverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        s=s.trim();
        String[] strNums=s.split(" ");
        res.append(strNums[strNums.length-1]);
        for(int i=strNums.length-2;i>=0;i--){
            if(!"".equals(strNums[i])){
                res.append(" ");
                res.append(strNums[i]);
            }
        }
        return res.toString();
    }
}
