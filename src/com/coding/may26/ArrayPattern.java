package com.coding.may26;

import java.util.Arrays;

public class ArrayPattern {

    public static int[][] solve(int A){
        int[][] a = new int[A][];
        int[] b = new int[A];

        for(int i=0; i<A; i++){
            b[i] = i+1;
        }

        for(int i=0; i<A; i++){
            a[i] = Arrays.copyOfRange(b, 0, i+1);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(solve(3));
    }
}
