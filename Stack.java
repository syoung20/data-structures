public class Stack {

    LinkedList list;
    
    public Stack() {

       	      list = new LinkedList();

	      }


	      public void push(int data) {

	      list.insert(data);

	      }

	      public int pop() {

	      Node n = list.head;

	      while (n.next.next != null) {

	      	    n = n.next;

		    }
		    int data = n.next.d;

		    n.next = null;
		    
		    return data;

}

	public void printStack() {

	    list.printList();

}


	public static void main(String args[]) {

	    Stack stack = new Stack();
	       stack.push(1);
	       stack.push(2);
	       stack.push(3);
	       stack.push(4);
	       stack.push(5);

	       stack.printStack();

	       int p = stack.pop();
	       System.out.println(p);

	       stack.printStack();

}
}
