import java.util.*;

public class myClass {
	

	void insert(String myString) {  // insert 
		Node n = root;
		char ch[] = myString.toCharArray();
		for (int i = 0; i < myString.length(); ++i) {
			
			if (!n.root.containsKey(ch[i])) {
				
				n.root.put(ch[i], new Node());
			}
			n = n.root.get(ch[i]);
		}
		n.child = true;
	}
	

	static void nextN(Node arg, String sub) {
		if (arg.child)
			System.out.println(sub);
		for (Character ch : arg.root.keySet()) {
			nextN(arg.root.get(ch), sub + ch);
		}
	}
	
	public static class Node {
		Map<Character, Node> root = new HashMap<Character, Node>();
		boolean child;
		Node Current;

		public boolean ends;

		public boolean containsKey(char first) {

			return false;
		}

		public Node get(char first) {

			return null;
		}

	}
	
	Node root = new Node();

	public static void main(String[] args) {
		myClass p = new myClass();
		System.out.println("Ctrl + Z to exit");
		Scanner input = new Scanner(System.in);
		System.out.println();

		while (input.hasNextLine()) {

			p.insert(input.nextLine());
		}

		System.out.println();
		System.out.println("The Output is :");

		nextN(p.root, "");
	}

}
