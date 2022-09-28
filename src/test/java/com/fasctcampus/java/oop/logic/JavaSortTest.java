package com.fasctcampus.java.oop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Minguin on 2022/09/28.
 */
class JavaSortTest {
    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //Given
        BubbleSort<Integer> javaSort = new BubbleSort<>();

        // When
        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));

        //then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}