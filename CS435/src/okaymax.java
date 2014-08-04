
public class okaymax {

	class node{
		
		int data;
		node next;
		//node(int n){
			//n = data;
		//}
	}
	
	node first;
	node curr;
	
	public void insertData(int arg,node One){
		first = new node();
		node myNode = new node();
		myNode = One;
		curr = first;
		
		if (curr == null){
			myNode.data = arg;
			first = myNode;
			myNode.next = null;
		}
		else {
			
		while(curr.next != null){
			curr = curr.next;
		}
		myNode.data = arg;
		curr.next = myNode;
		myNode.next = null;
		curr = myNode;
		}
	}
	
	public int count(){
		int counter = 0;
		while(curr.next != null){
			curr = curr.next;
		}
		return counter;
	}
	
}
