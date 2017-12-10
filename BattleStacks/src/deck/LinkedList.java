package deck;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	LinkedList() {
		head = null;
		tail = null;
	}
	
	LinkedList(Node<E> head) {
		this.head = head;
		this.head.next = null;
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public E get(int index) {
		return this.find(index).data;
	}
	
	private Node<E> find(int position) {
		int count = 0;
		for (Node<E> curr = head; curr != null; curr = curr.next ) {
			if (count == position) {
				return curr;
			}
			count++;
		}
		return null;
	}
	
	public void add(E input, int position) throws IndexOutOfBoundsException {
		if (position < 0 || position > size) {
			throw new IndexOutOfBoundsException("Position " + position + " does not exist in this list");
		}
		else if (position == 0) {
			Node<E> first = head;
			Node<E> newNode = new Node<E>(input);
			head = newNode;
			newNode.next = first;
		} else if (position == size) {
			add(input);
			return;
		} else {
			Node<E> prev = find(position - 1);
			Node<E> newNode = new Node<E>(input);
			Node<E> curr = prev.next;
			prev.next = newNode;
			newNode.next = curr;
		}
		size++;
	}
	
	public void add(E input) {
		size++;
		Node<E> newNode = new Node<E>(input);
		if (head == null) {
			head = newNode;
			tail = newNode;
			/*System.out.println("Head points to: " + head.data);
			System.out.println("Tail points to: " + tail.data + "\n");*/
			return;
		} else {
			tail.next = newNode;
			tail = newNode;
			/*System.out.println("Head points to: " + head.data);
			System.out.println("Tail points to: " + tail.data + "\n");*/
		}
	}
	
	public E remove(int position) throws IndexOutOfBoundsException {
		E deleted = null;
		if (position < 0 || position >= size) {
			throw new IndexOutOfBoundsException("Position " + position + " does not exist in this list");
		} else if (position == 0) {
			Node<E> first = head;
			deleted = head.data;
			head = first.next;
			first.next = null;
		} else if (position > 0 && position <= size) {
			Node<E> prev = find(position - 1);
			Node<E> curr = prev.next;
			if (curr.data != null) {
				deleted = curr.data;
			}
			prev.next = prev.next.next;
			curr.next = null;
		}
		size--;
		return deleted;
	}
	
	public boolean contains(E data) {
		Node<E> first = head;
		Node<E> curr = first;
		if (head == null) return false;
		do {
			if (curr.data.equals(data)) {
				return true;
			} else {
				curr = curr.next;
			}
		} while (curr != null);
		return false;
	}
	
	public void display() {
		for (Node<E> curr = head; curr != null; curr = curr.next) {
			if (curr.next != null) {
				System.out.print(curr.data + ", ");
			} else {
				System.out.print(curr.data);
			}
		}
		System.out.println();;
	}
}