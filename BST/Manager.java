package DataStructureAssignmentSolution.BST;

class Node {
    int value;
    Node left, right;
    Node(int item) {
        value = item;
        left = right = null;
    }
}
class Manager {
    public Node node;
    public Node prevNode = null;
    public Node nextNode = null;
    public void createSkewedTree(Node root, int order) {
        if (root == null) {
            return;
        }
        if (order > 0) {
            createSkewedTree(root.right, order);
        }
        else {
            createSkewedTree(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;
        if (nextNode == null) {
            nextNode = root;
        }
        else {
            prevNode.right = root;
        }
        root.left = null;
        prevNode = root;
        if (order > 0) {
            createSkewedTree(leftNode, order);
        }
        else {
            createSkewedTree(rightNode, order);
        }
    }
    public void traverseRight(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        traverseRight(root.right);
    }
}