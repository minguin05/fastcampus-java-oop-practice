package com.fasctcampus.java.oop;

import com.fasctcampus.java.oop.logic.BubbleSort;

import java.util.Arrays;

/**
 * Created by Minguin on 2022/09/28.
 */
public class Main {
    public static void main(String[] args) {

        BubbleSort<String> sort = new BubbleSort<>();
        System.out.println("{result} " + sort.sort(Arrays.asList(args)));

    }
}
