package com.jay.ds.array;


public class Solution {
    public  int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;

        for(int i = 0; i < A.length - 1; i++)  {
            for(int j = i+1; j < A.length; j++)  {
                boolean isTrue = isBiValued(A, i , j);
                //System.out.println("isTrue : " + isTrue + " for index i = " + i + ", j = "+ j);
                if(isTrue) {
                    if((j - i + 1)>max ) {
                        max =j - i + 1;
                    }
                }

            }
        }

        return max;
    }

    public  boolean isBiValued(int[] A1, int start,int  end) {
        boolean isBiValued = true;
        int a = A1[start];
        int b = 0;
        int k = start + 1;
        for(; k <=end; k++) {
            if(A1[k]!= a) {
                b= A1[k];
                break;
            }
        }
        // if(k == end - 1) {
        //     return isBiValued;
        // }
        if(end - start == 1 && a!= b) {
            return isBiValued;
        }


        for(;k <=end; k++) {
            if(A1[k]!= a && A1[k] != b) {
                isBiValued = false;
                break;
            }
        }
        return  isBiValued;
    }
}
