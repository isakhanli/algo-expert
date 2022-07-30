package easy;

import java.util.ArrayList;
import java.util.List;

public class depth_first_search {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            traverse(name, children, array);
            return array;
        }

        public void traverse(String name, List<Node> children, List<String> result){
            result.add(name);

            if (children == null || children.isEmpty())
                return;

            for (Node node : children)
                traverse(node.name, node.children, result);
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }





}
