 using System;  
                      
public class CreateList  
{  
    //Represent a node of the singly linked list  
    public class Node<T>{  
        public T data;  
        public Node<T> next;  
          
        public Node(T value) {  
            data = value;  
            next = null;  
        }  
    }  
          
    public class SinglyLinkedList<T>{  
        //Represent the head and tail of the singly linked list  
        public Node<T> head = null;               
         public Node<T> tail = null;  
      
        //addNode() will add a new node to the list  
        public void addNode(T data) {  
            //Create a new node  
            Node<T> newNode = new Node<T>(data);  
   
            //Checks if the list is empty  
            if(head == null) {  
                //If list is empty, both head and tail will point to new node  
                head = newNode;  
                tail = newNode;  
            }  
            else {  
                //newNode will be added after tail such that tail's next will point to newNode  
                tail.next = newNode;  
                //newNode will become new tail of the list  
                tail = newNode;  
            }  
        }  
   
        //display() will display all the nodes present in the list  
        public void display() {  
            //Node current will point to head  
            Node<T> current = head;  
              
            if(head == null) {  
                Console.WriteLine("List is empty");  
                return;  
            }  
            Console.WriteLine("Nodes of singly linked list: ");  
            while(current != null) {  
                //Prints each node by incrementing pointer  
                Console.Write(current.data + " ");  
                current = current.next;  
            }  
            Console.WriteLine();  
        }  
    }  
      
    public static void Main()  
    {  
        SinglyLinkedList<int> sList = new SinglyLinkedList<int>();  
          
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
          
        //Displays the nodes present in the list  
        sList.display();      
    }  
}  