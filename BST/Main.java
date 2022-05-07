package DataStructureAssignmentSolution.BST;

public class Main {
	public static void main (String[] args) {
		 Manager tree = new Manager();
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left = new Node(55);
	     int order = 0;
	     tree.createSkewedTree(tree.node, order);
	     tree.traverseRight(tree.nextNode);
	 }
}
