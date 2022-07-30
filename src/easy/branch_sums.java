package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class branch_sums {

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

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> result = new ArrayList<>();
        traverse(result, root, 0);

        return result;
    }

    public static void traverse(List<Integer> result, BinaryTree root, int sum){
        if (root.left == null && root.right == null){
            result.add(sum + root.value);
            return;
        }

        if(root.left != null)
            traverse(result, root.left, sum + root.value);

        if(root.right != null)
            traverse(result, root.right, sum + root.value);

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


        System.out.println(branchSums(_10));
    }
}
