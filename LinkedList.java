public class LinkedList {

    public LinkedList() {}

    Node head = null;

    public void insert(int data) {

	if (this.head != null) {

	    Node tail = new Node(data);
	    Node n = head;
	    while (n.next != null) {

		n = n.next;

	    }
			   
	    n.next = tail;
	    
	} else {

	    head = new Node(data);
	    head.next = null;

	}

    }
	

    public void delete(int data) {

	Node n = head;
	while (n.next != null) {

	    if (n.next.d == data) {

		if (n.next.next != null) {

		    n.next = n.next.next;

		} else {

		    n.next = null;

		}
	    }

	    n = n.next;
	}
    }
		       	  
    public void printList() {
	
	Node p = this.head;
	while (p != null) {
	    
	    System.out.println(p.d);
	    
	    p = p.next;
	    
	}
    }

    
    public static void main(String args[]) {

	LinkedList list = new LinkedList();
	list.insert(1);
	list.insert(2);
	list.insert(3);
	list.insert(4);
	list.insert(5);

	list.printList();
		   
	list.delete(3);

	list.printList();
		     
    }
}
