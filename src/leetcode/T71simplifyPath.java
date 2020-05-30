/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

import java.util.Stack;

/**
 * @author MessiahJK
 * @version : T71simplifyPath.java 2020/05/31 1:30 MessiahJK
 */
public class T71simplifyPath {
    public String simplifyPath(String path) {
        String[] strs=path.split("/");
        StringBuilder res=new StringBuilder();
        Stack stack=new Stack();
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("")||strs[i].equals(".")){
                continue;
            }else if(strs[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(strs[i]);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        for(int i=0;i<stack.size();i++){
            res.append("/");
            res.append(stack.get(i));
        }
        return res.toString();
    }
}
