package ds.d_quees.a_linear.linkedlist_based;

public class LinkedListQueue {

	 

	public static void main(String[] args) {
		
		Queue queue=new Queue();
		queue.enqueue(34);
		queue.enqueue(64);
		queue.enqueue(56);
		queue.enqueue(32);
		queue.enqueue(3);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
	}

}
