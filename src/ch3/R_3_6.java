/* The solution is from line 59 to 65. findSecondLast() method*/
package ch3;

// If the class doesn't have visibility modifier, it will be set to 'private' by default
class SinglyLinkedList<E> {
	private class Node<E> {
		private E element; // reference to the element stored at this node
		private Node<E> next; // reference to the subsequent node in the list
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement( ) { return element; }
		public Node<E> getNext( ) { return next; }
		public void setNext(Node<E> n) { next = n; }
	}
	
	// instance variables of the SinglyLinkedList
	private Node<E> head = null; // head node of the list (or null if empty)
	private Node<E> tail = null; // last node of the list (or null if empty)
	private int size = 0; // number of nodes in the list
	public SinglyLinkedList( ) { } // constructs an initially empty list
	// access methods
	public int size( ) { return size; }
	public boolean isEmpty( ) { return size == 0; }
	public E first( ) { // returns (but does not remove) the first element
		 if (isEmpty( )) return null;
		 return head.getElement( );
	}
	 public E last( ) { // returns (but does not remove) the last element
		 if (isEmpty( )) return null;
	 	 return tail.getElement( );
	 }
	// update methods
	 public void addFirst(E e) { // adds element e to the front of the list
		 head = new Node<>(e, head); // create and link a new node
		 if (size == 0)
		 	tail = head; // special case: new node becomes tail also
		 size++;
	 }
	 public void addLast(E e) { // adds element e to the end of the list
		 Node<E> newest = new Node<>(e, null); // node will eventually be the tail
		 if (isEmpty( ))
			 head = newest; // special case: previously empty list
		 else
			tail.setNext(newest); // new node after existing tail
		 tail = newest; // new node becomes the tail
		 size++;
	}
	public E removeFirst( ) { // removes and returns the first element
		if (isEmpty( )) return null; // nothing to remove
		E answer = head.getElement( );
		head = head.getNext( ); // will become null if list had only one node
		size--;
		if (size == 0)
			tail = null; // special case as list is now empty
		return answer;
	}
	public void findSecondLast() {
		Node<E> currentNode = head;
		while(currentNode.getNext().getNext() != null) {
			currentNode = currentNode.getNext();
		}
		System.out.print("The second last node in this list is "+currentNode.getElement());
	}
	public void printList() {
		if(isEmpty()) {
			System.out.println("Empty list");
		}else {
			Node<E> currentNode = head;
			while(currentNode != null) {
				System.out.print(currentNode.getElement() + "->");
				currentNode = currentNode.getNext();
				if(currentNode == null) {
					System.out.println("null");
					break;
				}
				
			}
		}
	}
}
public class R_3_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.addLast("Nam");
		list.addLast("Do");
		list.addLast("CR7");
		list.addFirst("Huynh");
		list.printList();
		list.findSecondLast();

	}

}
