package com.eduardourbina;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCost {
    public static void main(String[] args) {
        /**
         * Anna has an array of n integers called NUM. She can reduce the array by one element by performing a move.
         * Each move consists of the following three steps:
         *
         *  1. Pick two different elements NUM[i] and NUM[j] where i is different from j.
         *  2. Remove the two selected elements from the array.
         *  3. Add the sum of the two selected elements to the end of the array
         */

        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(5);
        num.add(5);
        num.add(5);

        System.out.println(reductionCost(num));
    }

    public static int reductionCost(ArrayList<Integer> num){
        int finalCost = 0;
        int carry = 0;

        while(num.size() >= 2) {
            carry = num.get(0) + num.get(1);
            num.add(carry);
            finalCost += num.get(0) + num.get(1);
            num.remove(0);
            num.remove(0);
        }

        return finalCost;
    }
}
