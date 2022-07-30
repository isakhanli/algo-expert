package easy;

import java.util.HashMap;
import java.util.Map;

public class find_closest_value_in_bst {

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        Map<Integer, Integer> differencesMap = new HashMap<>();
        traverse(differencesMap, tree, target);

        int node = 0;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : differencesMap.entrySet()){
            if (entry.getValue() < min){
                node = entry.getKey();
                min = entry.getValue();
            }
        }

        return node;
    }

    public static void  traverse(Map<Integer, Integer> map, BST node, int target){
        if (node == null)
            return;

        map.put(node.value, Math.abs(node.value - target));

        traverse(map, node.left, target);
        traverse(map, node.right, target);

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
        BST _10 = new BST(10);
        BST _5 = new BST(5);
        BST _15 = new BST(15);
        BST _2 = new BST(2);
        BST _5_2 = new BST(5);
        BST _1 = new BST(1);
        BST _13 = new BST(13);
        BST _22 = new BST(22);
        BST _14 = new BST(14);

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


        System.out.println(findClosestValueInBst(_10, 12));
    }
}
