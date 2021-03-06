package com.abn.dsalgos.challenges.binaryTree;

import com.abn.dsalgos.utils.MyTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
Breadth First Search implementation of BT
 */

public class BinaryTreeBFS<T> {

    public MyTreeNode root;

    public BinaryTreeBFS() {
        root = null;
    }

    public void breadthFirstSearch(MyTreeNode node) {
        Queue<MyTreeNode> queue = new LinkedList<>();
        if (node == null) {
            return;
        }

        queue.add(node);

        while (!queue.isEmpty()) {
            MyTreeNode temp = queue.remove();
            System.out.println(temp.data);

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

}
