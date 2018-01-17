package Practice.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {

	private Node root;

	public static void main(String[] args) {
		Tree t = new Tree();
		t.root = new Node(1);
		t.root.left = new Node(2);
		t.root.right = new Node(3);
		t.root.left.left = new Node(4);
		t.root.left.right = new Node(5);
		t.root.right.left = new Node(6);
		t.root.right.right = new Node(7);
		System.out.println(t.lowestCommonAncestor(4, 5));// 2
		System.out.println(t.lowestCommonAncestor(4, 6));// 1
		System.out.println(t.lowestCommonAncestor(3, 4));// 1
		System.out.println(t.lowestCommonAncestor(2, 4));// 2
	}

	private Integer lowestCommonAncestor(Integer n1, Integer n2) {
		n1Path.clear();
		n2Path.clear();
		findPath(root, n1, n1Path);
		findPath(root, n2, n2Path);

		int i;
		for (i = 0; i < n1Path.size() && i < n2Path.size(); i++) {			
			if (!n1Path.get(i).equals(n2Path.get(i))) {
				break;
			}
			
		}
		return n1Path.get(i - 1);
	}

	private List<Integer> n1Path = new ArrayList<>();
	private List<Integer> n2Path = new ArrayList<>();

	private boolean findPath(Node root, Integer n, List<Integer> nPath) {
		if (root == null) {
			return false;
		}
		if (root.data == n) {
			return true;
		}

		nPath.add(root.data);

		if (root.left != null && findPath(root.left, n, nPath)) {
			return true;
		}
		if (root.right != null && findPath(root.right, n, nPath)) {
			return true;
		}
		nPath.remove(nPath.size() - 1); // last removal
		return false;
	}

	public static class Node {
		Node left;
		Integer data;
		Node right;

		public Node(Integer data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
}
