package com.coding.may21;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Strictly {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();

        number.add(10);
        number.add(20);
        number.add(5);
        Collections.sort(number);

        System.out.println(number);
    }
}
