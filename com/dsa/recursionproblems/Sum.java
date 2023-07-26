package com.dsa.recursionproblems;

public class Sum {
    public static void main(String args[]){
        int n = 5; //5+4+3+2+1 = 15
        int sum = sumRecusrion(n);
        System.out.println(sum);//15
    }
    static int sumRecusrion(int n){
        if(n==1){
            return 1;
        }
        int rec_call = sumRecusrion(n-1);
        int small_calc = rec_call+n;
        return small_calc;
    }
}
