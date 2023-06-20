package com.codecool.katas.paginationHelper;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PaginationHelperTest {

    // Tests taken from Codewars

    @Test @Order(1) @DisplayName("Sample tests from description")
    void sampleTestsFromDescription() {
        List<Character> collection = List.of('a', 'b', 'c', 'd', 'e', 'f');
        PaginationHelper<Character> helper = new PaginationHelper<>(collection, 4);
        assertEquals(6, helper.itemCount(), "itemCount is returning incorrect value");
        assertEquals(2, helper.pageCount(), "pageCount is returning incorrect value");
        assertEquals( 4, helper.pageItemCount(0), "pageItemCount is returning incorrect value for page 0");
        assertEquals( 2, helper.pageItemCount(1), "pageItemCount is returning incorrect value for page 1");
        assertEquals(-1, helper.pageItemCount(2), "pageItemCount is returning incorrect value for page 2");
        assertEquals( 1, helper.pageIndex(5), "pageIndex is returning incorrect value for index 5");
        assertEquals( 0, helper.pageIndex(2), "pageIndex is returning incorrect value for index 2");
        assertEquals(-1, helper.pageIndex(20), "pageIndex is returning incorrect value for index 20");
        assertEquals(-1, helper.pageIndex(-10), "pageIndex is returning incorrect value for index -10");
    }

    @Test @Order(2) @DisplayName("Fixed tests")
    void fixedTest() {
        List<Integer> collection = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24);
        PaginationHelper<Integer> helper = new PaginationHelper<>(collection, 10);
        assertEquals(24, helper.itemCount(), "itemCount is returning incorrect value");
        assertEquals( 3, helper.pageCount(), "pageCount is returning incorrect value");
        assertEquals(10, helper.pageItemCount(0), "pageItemCount is returning incorrect value for page 0");
        assertEquals(10, helper.pageItemCount(1), "pageItemCount is returning incorrect value for page 1");
        assertEquals( 4, helper.pageItemCount(2), "pageItemCount is returning incorrect value for page 2");
        assertEquals(-1, helper.pageItemCount(3), "pageItemCount is returning incorrect value for page 3");
        assertEquals(-1, helper.pageItemCount(-1), "pageItemCount is returning incorrect value for page -1");
        assertEquals(0, helper.pageIndex(0), "pageIndex is returning incorrect value for index 0");
        assertEquals(0, helper.pageIndex(3), "pageIndex is returning incorrect value for index 3");
        assertEquals(0, helper.pageIndex(9), "pageIndex is returning incorrect value for index 9");
        assertEquals(1, helper.pageIndex(10), "pageIndex is returning incorrect value for index 10");
        assertEquals(1, helper.pageIndex(19), "pageIndex is returning incorrect value for index 19");
        assertEquals(2, helper.pageIndex(20), "pageIndex is returning incorrect value for index 20");
        assertEquals(2, helper.pageIndex(22), "pageIndex is returning incorrect value for index 22");
        assertEquals(2, helper.pageIndex(23), "pageIndex is returning incorrect value for index 23");
        assertEquals(-1, helper.pageIndex(24), "pageIndex is returning incorrect value when provided a itemIndex argument (24) that was out of range");
        assertEquals(-1, helper.pageIndex(40), "pageIndex is returning incorrect value when provided a itemIndex argument (40) that was out of range");
        assertEquals(-1, helper.pageIndex(-1), "pageIndex is returning incorrect value for negative index -1");
        assertEquals(-1, helper.pageIndex(-15), "pageIndex is returning incorrect value for negative index -15");
        assertEquals(-1, helper.pageIndex(-23), "pageIndex is returning incorrect value for negative index -23");
    }

    @Test @Order(3) @DisplayName("Edge case: List [1,2,3,4] with 4 items per page")
    void edgeCase() {
        List<Integer> collection = List.of(1,2,3,4);
        PaginationHelper<Integer> helper = new PaginationHelper<>(collection, 4);
        assertEquals( 4, helper.itemCount(), "itemCount is returning incorrect value");
        assertEquals( 1, helper.pageCount(), "pageCount is returning incorrect value");
        assertEquals( 4, helper.pageItemCount(0), "pageItemCount is returning incorrect value for page 0");
        assertEquals(-1, helper.pageItemCount(1), "pageItemCount is returning incorrect value for page 1");
        assertEquals( 0, helper.pageIndex(0), "pageIndex is returning incorrect value for index 0");
        assertEquals( 0, helper.pageIndex(3), "pageIndex is returning incorrect value for index 3");
        assertEquals(-1, helper.pageIndex(4), "pageIndex is returning incorrect value for index 4");

        helper = new PaginationHelper<>(collection, 1);
        assertEquals( 4, helper.itemCount(), "itemCount is returning incorrect value");
        assertEquals( 4, helper.pageCount(), "pageCount is returning incorrect value");
        assertEquals( 1, helper.pageItemCount(0), "pageItemCount is returning incorrect value for page 0");
        assertEquals( 1, helper.pageItemCount(1), "pageItemCount is returning incorrect value for page 1");
        assertEquals( 1, helper.pageItemCount(2), "pageItemCount is returning incorrect value for page 2");
        assertEquals( 1, helper.pageItemCount(3), "pageItemCount is returning incorrect value for page 3");
        assertEquals(-1, helper.pageItemCount(4), "pageItemCount is returning incorrect value for page 4");
        assertEquals( 0, helper.pageIndex(0), "pageIndex is returning incorrect value for index 0");
        assertEquals( 1, helper.pageIndex(1), "pageIndex is returning incorrect value for index 1");
        assertEquals( 2, helper.pageIndex(2), "pageIndex is returning incorrect value for index 2");
        assertEquals( 3, helper.pageIndex(3), "pageIndex is returning incorrect value for index 3");
        assertEquals(-1, helper.pageIndex(4), "pageIndex is returning incorrect value for index 4");
    }

    @Test @Order(4) @DisplayName("Empty collection")
    void emptyCollection() {
        PaginationHelper<?> empty = new PaginationHelper<>(List.of(), 10);
        assertEquals( 0, empty.itemCount(), "itemCount is returning incorrect value");
        assertEquals( 0, empty.pageCount(), "pageCount is returning incorrect value");
        assertEquals(-1, empty.pageItemCount(0), "pageItemCount is returning incorrect value for page 0");
        assertEquals(-1, empty.pageItemCount(1), "pageItemCount is returning incorrect value for page 1");
        assertEquals(-1, empty.pageIndex(0), "pageIndex(0) called when there was an empty collection");
        assertEquals(-1, empty.pageIndex(1), "pageIndex(1) called when there was an empty collection");
        assertEquals(-1, empty.pageIndex(-1), "pageIndex(-1) called when there was an empty collection");
    }

}
