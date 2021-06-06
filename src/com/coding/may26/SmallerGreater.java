package com.coding.may26;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class SmallerGreater {

    private static int solve(ArrayList<Integer> A){

        Collections.sort(A);
        System.out.println(A);

        int count = 0;

        for(Integer a: A){
            if((A.get(0) < a) && (A.get(A.size()-1) > a) ){
                count++;
            }
        }

        return count;
    }

    private static int optimalSolution(ArrayList<Integer> l){

        int min = 1000000;
        int max = -1;
        int count = 0;

        for(Integer a: l){
            max = Math.max(a, max);
            min = Math.min(a, min);
        }

        for(Integer a: l){
            if((min < a) && (a < max)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(10);
        l.add(10);
        l.add(10);
        l.add(40);
        l.add(50);
        l.add(50);
        System.out.println(solve(l));
        System.out.println("OptimalSolution\n"+optimalSolution(l));
    }

}
