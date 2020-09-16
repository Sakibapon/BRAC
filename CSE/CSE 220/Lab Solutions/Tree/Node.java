public class Node {
    Object item; // the key within the node
    Node left; // reference to the left child
    Node right; // reference to the right child
    Node parent; // reference to the parent node
    public Node(Object i, Node l, Node r, Node p) {
        item = i;
        left = l;
        right = r;
        parent = p;
    }
}