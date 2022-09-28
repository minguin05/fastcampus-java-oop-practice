package com.fasctcampus.java.oop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Minguin on 2022/09/28.
 */
public class JavaSort<T extends Comparable<T>> {
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);
        return output;
    }
}
