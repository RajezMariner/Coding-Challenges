package com.coding.may21;

public class NestedCmpl {

    public static void main(String[] args) {
        int count = 0;
        int N = 10;
        for(int i = N; i > 0; i/=2){
            for(int j=0; j < i; j++){
                count += 1;
            }
            System.out.println("Count: "+count +" i value: "+i);
        }
    }
}
