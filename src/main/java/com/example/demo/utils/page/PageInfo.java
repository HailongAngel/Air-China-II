package com.example.demo.utils.page;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-13 16:33
 **/
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private  int currentPage;
    private int pageSize;
    private long count;
    private List<T> list;
    public PageInfo(List<T> list) {
        this(list, 8);
    }

    public PageInfo(List<T> list, int navigatePages) {
        if (list instanceof Page) {
            Page page = (Page)list;
            this.currentPage = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.list = page;
            int size = page.size();
            this.count = page.getTotal();
        } else if (list instanceof Collection) {
            this.currentPage = 1;
            this.pageSize = list.size();
            this.list = list;
            this.count = (long)list.size();
        }
    }
    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", count=" + count +
                ", list=" + list +
                '}';
    }
}


