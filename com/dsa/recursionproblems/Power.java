package com.dsa.recursionproblems;

public class Power {
    public static void main(String args[]){
        int n = 2;//2 * 2* 2* 2
        int m = 4;
        int power = powerRecursion(n,m);
        System.out.println(power);
    }
    static int powerRecursion(int n, int m){
        if(m==1){
            return n;
        }
        int rec_call = powerRecursion(n,m-1);
        int small_calc = n * rec_call;
        return small_calc;
    }
}
