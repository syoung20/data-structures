public class Queue{

    LinkedList list;

    public Queue() {

        list = new LinkedList();
       
       }
       
       public void push(int data) {
	      
       	     list.insert(data);

	     }

	public int pop() {

	       int d = list.head.d;
	       list.head = list.head.next;
	       return d;
	       }
	      	 

	public void printQueue() {

	       list.printList();

	       }


       public static void main(String args[]) {

       Queue queue = new Queue();
       queue.push(1);
       queue.push(2);
       queue.push(3);
       queue.push(4);

       queue.printQueue();
       queue.pop();
       queue.printQueue();

}
}
