package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>(Arrays.asList(1, -9, 4, 5, 0, -8));
        System.out.println("original nums:\n");
        printList(nums);
        bubbleSort(nums);

        System.out.println("sorted nums:\n");
        printList(nums);
    }

    private static void bubbleSort(List <Integer> nums){
        for(int i = 0; i < nums.size(); i++)
            for(int j = i + 1; j < nums.size(); j++)
                if(nums.get(i) > nums.get(j))
                    swap(nums, i, j);
    }

    private static void printList(List <Integer> nums){
        for(var num : nums)
            System.out.print(num + "\t");
        System.out.println();
    }
}