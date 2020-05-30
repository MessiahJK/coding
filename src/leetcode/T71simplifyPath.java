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
        String[] strNums=path.split("/");
        StringBuilder res=new StringBuilder();
        Stack<String> stack=new Stack<>();
        for (String str : strNums) {
            if ("..".equals(str)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if(!("".equals(str) || ".".equals(str))){
                stack.push(str);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        for (String s : stack) {
            res.append("/");
            res.append(s);
        }
        return res.toString();
    }
}
