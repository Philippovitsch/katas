package com.codecool.katas.paginationHelper;

import java.util.List;

public class PaginationHelper<I> {

    // Source: https://www.codewars.com/kata/515bb423de843ea99400000a

    private final List<I> collection;
    private final int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    public int itemCount() {
        return collection.size();
    }

    public int pageCount() {
        return (int) Math.ceil((double) collection.size() / itemsPerPage);
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount()) {
            return -1;
        }
        if (pageIndex == pageCount() - 1) {
            return (itemCount() % itemsPerPage != 0) ? itemCount() % itemsPerPage : itemsPerPage;
        }
        return itemsPerPage;
    }

    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount()) {
            return -1;
        }
        return Math.floorDiv(itemIndex, itemsPerPage);
    }

}
