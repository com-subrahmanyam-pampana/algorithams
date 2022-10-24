package ds.d_quees.circular.arraycircular;

import java.util.Arrays;

public class Queue {
	private int size, front, rear;
	private  int[] queue;
	 

	Queue(int size)
	{
	    this.size = size;
	    this.front = this.rear = -1;
	    queue= new int[size];
	}
	 
	
	 void enQueue(int data)
	{
	     
	    // Condition if queue is full.
	    if((front == 0 && rear == size - 1) ||
	      (rear == (front - 1) % (size - 1)))
	    {
	        System.out.print("Queue is Full");
	    }
	 
	    // condition for empty queue.
	    else if(front == -1)
	    {
	        front = 0;
	        rear = 0;
	        queue[rear]= data;
	    }
	 
	    else if(rear == size - 1 && front != 0)
	    {
	        rear = 0;
	        queue[rear]= data;
	    }
	 
	    else
	    {
	        rear = (rear + 1);
	     
	        // Adding a new element if
	        if(front <= rear)
	        {
	            queue[rear]= data;
	        }
	     
	        // Else updating old value
	        else
	        {
	            queue[rear]= data;
	        }
	    }
	}
	 
	int deQueue()
	{
	    int temp;
	 
	    // Condition for empty queue.
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
	         
	        // Return -1 in case of empty queue
	        return -1;
	    }
	 
	    temp = queue[front];
	 
	    // Condition for only one element
	    if(front == rear)
	    {
	        front = -1;
	        rear = -1;
	    }
	 
	    else if(front == size - 1)
	    {
	        front = 0;
	    }
	    else
	    {
	        front = front + 1;
	    }
	     
	    // Returns the dequeued element
	    return temp;
	}
	 
	// Method to display the elements of queue
	public void print()
	{
	     
	    // Condition for empty queue.
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
	        return;
	    }
	 
	    // If rear has not crossed the max size
	    // or queue rear is still greater then
	    // front.
	    System.out.print("Elements in the " +
	                     "circular queue are: ");
	 
	    if(rear >= front)
	    {
	     
	        // Loop to print elements from
	        // front to rear.
	        for(int i = front; i <= rear; i++)
	        {
	            System.out.print(queue[i]);
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	 
	    // If rear crossed the max index and
	    // indexing has started in loop
	    else
	    {
	         
	        // Loop for printing elements from
	        // front to max size or last index
	        for(int i = front; i < size; i++)
	        {
	            System.out.print(queue[i]);
	            System.out.print(" ");
	        }
	 
	        // Loop for printing elements from
	        // 0th index till rear position
	        for(int i = 0; i <= rear; i++)
	        {
	            System.out.print(queue[i]);
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}	
	
}
