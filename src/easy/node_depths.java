package easy;

import java.util.ArrayList;
import java.util.List;

public class node_depths {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.

        List<Integer> depths = new ArrayList<>();
        traverse(depths, root, 0);

        int sum = depths.stream().reduce(0 , Integer::sum);
        return sum;
    }

    public static void traverse(List<Integer> depthList, BinaryTree root, int depth){
        if (root == null)
            return;

        depthList.add(depth);

        traverse(depthList, root.left, depth + 1);
        traverse(depthList, root.right, depth + 1);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BinaryTree _10 = new BinaryTree(10);
        BinaryTree _5 = new BinaryTree(5);
        BinaryTree _15 = new BinaryTree(15);
        BinaryTree _2 = new BinaryTree(2);
        BinaryTree _5_2 = new BinaryTree(5);
        BinaryTree _1 = new BinaryTree(1);
        BinaryTree _13 = new BinaryTree(13);
        BinaryTree _22 = new BinaryTree(22);
        BinaryTree _14 = new BinaryTree(14);

        _10.left = _5;
        _10.right = _15;

        _5.left = _2;
        _5.right = _5_2;

        _5_2.right = null;
        _5_2.left = null;

        _2.left = _1;
        _2.right = null;

        _1.left = null;
        _1.right = null;

        _15.left = _13;
        _15.right = _22;

        _13.left = null;
        _13.right = _14;

        _14.left = null;
        _14.right = null;

        _22.left = null;
        _22.right = null;


        System.out.println(nodeDepths(_10));
    }
}
