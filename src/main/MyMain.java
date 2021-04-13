package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(66);
        tree.insert(77);
        tree.insert(65);
        tree.insert(10);
        tree.insert(53);
        tree.insert(74);
        tree.inOrder(tree.getRoot());
        tree.insert(18);
        tree.inOrder(tree.getRoot());
        System.out.println(tree.search(10));
        System.out.println(tree.search(74));
    }
}
