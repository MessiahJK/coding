/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T50PowXn.java 2020/05/11 22:33 MessiahJK
 */
public class T50PowXn {

    public double myPow(double x, int n) {
        return n>0?quickPow(x, n):(1.0/quickPow(x,-(long) n));
    }
    public double quickPow(double x , long n) {
        if(n==0){
            return 1.0;
        }
        double result = 1.0;
        double temp=x;
        while (n>0){
            if(n%2==1){
                result*=temp;
            }
            n/=2;
            temp*=temp;
        }
        return result;
    }
    public double myPow1(double x, int n) {
        return Math.pow(x,n);
    }
}
