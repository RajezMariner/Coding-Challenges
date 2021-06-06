package com.coding.may31;

import java.util.ArrayList;
import java.util.List;

public class RecursionComplexity {

    public static int searchNumberOccuurence(List<Integer> l, int k, int start, int end){
        if (start > end) return 0;
        int mid = (start+end)/2;
        if(l.get(mid) > k)return searchNumberOccuurence(l, k, start, mid-1);
        if(l.get(mid) < k)return searchNumberOccuurence(l, k, mid-1, end);
        System.out.println("Executing it Man..");
        System.out.println("Start: "+start+" End: "+ end);
        return searchNumberOccuurence(l, k, start, mid-1) + 1 + searchNumberOccuurence(l, k, mid+1, end);
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(2);
        l.add(2);
        l.add(2);
        l.add(2);
        int result = searchNumberOccuurence(l, 2, 0, l.size()-1);
        System.out.println(result);
        int a = 10^6;
        System.out.println(a);
    }
}
