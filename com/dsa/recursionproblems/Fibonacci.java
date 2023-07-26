package com.dsa.recursionproblems;

public class Fibonacci {
    public static void main(String args[]){
        int n = 6;//0,1,1,2,3,5,8
        int fibo = fibonacciRecursion(n);
        System.out.println(fibo);
    }

    static int fibonacciRecursion(int n){
        if(n==0)
                return 0;
        if(n==1)
                return 1;
        int right_call = fibonacciRecursion(n-1);
        int left_call = fibonacciRecursion(n-2);
        return right_call+left_call;

    }
}
