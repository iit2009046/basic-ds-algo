package com.practice.tree;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }


    Node insert(int data) {
        root = insertRec(root, data);
        return root;
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data >= data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root == null) {
            return;
        }
        inorderRec(root.left);
        System.out.println(root.data);
        inorderRec(root.right);
    }
}
