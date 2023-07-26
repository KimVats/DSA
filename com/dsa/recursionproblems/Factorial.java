package com.dsa.recursionproblems;

public class Factorial {
    public static void main(String args[]){
        int n = 5;// 5*4*3*2*1
        int fact = factorialRecursion(n);
        System.out.println(fact);
    }

    static int factorialRecursion(int n){
        if(n==1)
            return 1;
        int rec_call = factorialRecursion(n-1);
        int small_calc = n* rec_call;
        return small_calc;
    }
}
