package com.dsa.recursionproblems;

public class Product {
    public static void main(String args[]){
        int n = 5; //5*4*3*2*1 = 120
        int prod = prodRecusrion(n);
        System.out.println(prod);//15
    }
    static int prodRecusrion(int n){
        if(n==1){
            return 1;
        }
        int rec_call = prodRecusrion(n-1);
        int small_calc = rec_call*n;
        return small_calc;
    }
}
