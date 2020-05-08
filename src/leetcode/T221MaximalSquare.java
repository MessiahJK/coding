/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T221MaximalSquare.java 2020/05/08 13:55 MessiahJK
 */
public class T221MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int maxSide=0;
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int rows=matrix.length,lines=matrix.length;
        int[][] dp =new int[rows][lines];
        for(int i=0;i<rows;i++){
            for(int j=0;j<lines;j++){
                if(matrix[i][j]=='1'){
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                    }
                    maxSide= Math.max(maxSide, dp[i][j]);
                }
            }
        }
        return maxSide*maxSide;
    }
    public int maximalSquare1(char[][] matrix) {
        int result=0;
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return result;
        }
        int[][] dp =new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]=='1'){
                dp[0][i]=1;
                result=1;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]=='1'){
                dp[i][0]=1;
                result=1;
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    if(dp[i][j]>result){
                        result=dp[i][j];
                    }
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return result*result;
    }
}
