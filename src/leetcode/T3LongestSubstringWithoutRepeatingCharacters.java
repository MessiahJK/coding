/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T3LongestSubstringWithoutRepeatingCharacters.java 2020/05/07 22:54 MessiahJK
 */
public class T3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()<=0){
            return 0;
        }
        int length=s.length();
        int first=0,last=0;
        int ch[]=new int[130];
        for(int i=0;i<130;i++){
            ch[i]=-1;
        }
        ch[s.charAt(0)]=0;
        int ans=0;
        while(last<length-1){
            last++;
            if(ch[s.charAt(last)]!=-1&&ch[s.charAt(last)]>=first){
                int temp=last-first;
                ans=Math.max(ans,temp);
                first=ch[s.charAt(last)]+1;
            }
            ch[s.charAt(last)]=last;
        }
        ans=Math.max(ans,last-first+1);
        return ans;
    }
}
