package com.abn.dsalgos.utils;

public class MyTreeNode<T> {

    public MyTreeNode left, right;
    public T data;

    public MyTreeNode(T data) {
        this.data = data;
        left = right = null;
    }


}
