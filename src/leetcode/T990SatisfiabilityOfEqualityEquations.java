/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T990SatisfiabilityOfEqualityEquations.java 2020/06/08 23:17 MessiahJK
 */
public class T990SatisfiabilityOfEqualityEquations {
    private int[] parent =new int[27];
    public boolean equationsPossible(String[] equations) {
        for(int i = 0 ; i < 27 ; i++){
            parent[i] = i;
        }
        for(String str : equations){
            if(str.charAt(1) == '='){
                union(str.charAt(0)-'a',str.charAt(3)-'a');
            }
        }
        for(String str : equations){
            if(str.charAt(1) == '!'){
                if(find(str.charAt(0)-'a')==find(str.charAt(3)-'a')){
                    return false;
                }
            }
        }
        return true;
    }

    public void union(int index1,int index2){
        parent[find(index1)] = find(index2);
    }
    public int find(int index){
        if(parent[index] != index){
            int value = find(parent[index]);
            parent[index] =value;
            return value;
        }else{
            return index;
        }
    }
}
