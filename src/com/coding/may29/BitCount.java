package com.coding.may29;

public class BitCount {

    public static Integer bitCount(int val){
        int count = 0;
        while(val != 0) {
            int bit = val & 1;
            if (bit == 1) {
                count++;
            }
            val = val >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bitCount(6));
    }

}
