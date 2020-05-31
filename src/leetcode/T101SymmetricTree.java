/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T101SymmetricTree.java 2020/05/31 12:31 MessiahJK
 */
public class T101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
    public boolean check(TreeNode tn1,TreeNode tn2){
        if(tn1 == null && tn2 == null){
            return true;
        }
        if(tn1 == null || tn2 == null){
            return false;
        }
        return tn1.val == tn2.val && check(tn1.left,tn2.right) && check(tn1.right,tn2.left);
    }
}
