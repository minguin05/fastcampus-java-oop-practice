package com.fasctcampus.java.oop.logic;

import java.util.List;

/**
 * Created by Minguin on 2022/09/28.
 */
public interface Sort<T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
