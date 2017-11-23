package com.lkf.ttshop.dto;

public class Page {
    private int rows;
    private int page;
   // private int offset;

    public int getOffset() {
        return (page-1)*rows;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
