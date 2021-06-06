package com.coding.may26;

import java.util.ArrayList;

public class AtleastTwoGreatestElement {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int max = (int)Math.pow(-10,9);
        int secondGreatest = (int)Math.pow(-10, 9);
        for(Integer a: A){
            if(a > max){
                secondGreatest = max;
                max = a;
            }else if(a > secondGreatest){
                secondGreatest = a;
            }
        }
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(Integer a: A){
            if(a < secondGreatest){
                l.add(a);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(100001);
        l.add(-100001);
        System.out.println(solve(l));
    }
}
