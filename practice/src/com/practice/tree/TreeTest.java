package com.practice.tree;

public class TreeTest {

    public static void main(String args[]) {
        Tree tree = new Tree();

        // Inserting elements
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
    }
}
