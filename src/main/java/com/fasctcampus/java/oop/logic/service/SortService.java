package com.fasctcampus.java.oop.logic.service;

import com.fasctcampus.java.oop.logic.JavaSort;
import com.fasctcampus.java.oop.logic.Sort;

import java.util.List;

/**
 * Created by Minguin on 2022/09/28.
 */
public class SortService {

    private final Sort<String> sort;

    // 생성자 주입
    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }

}
