package Workshop;

public class Stack {

	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	 static class MyStack{
		 public static Node head;
		 
		 public static boolean isEmpty() {
			 return head == null;
		 }
		 public static void push(int data) {
			 Node newNode = new Node(data);
			 if(isEmpty()) {
				 head = newNode;
			 }else {
				 newNode.next = head;
				 head = newNode;
			 }
			 
			 System.out.println("push" + data);
		 }
		 
		 public static void display() {
			 if(isEmpty()) {
				 return;
			 }
			 Node current = head;
			 System.out.print("stack ");
			 while(current != null) {
				 System.out.print(current.data + " ");
				 current = current.next;
			 }
			 System.out.println();
		 }
		 
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack();
		s.push(4);
		s.push(1);
		s.push(2);
		s.push(3);
		

		s.display();
	}

}
