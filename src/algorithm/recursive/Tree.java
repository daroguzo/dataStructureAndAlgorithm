package algorithm.recursive;

public class Tree {
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }
    Node root;

    public void dfs(Node root) {
        if (root == null)
            return;
        else {
            dfs(root.lt);
            dfs(root.rt);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }
}
