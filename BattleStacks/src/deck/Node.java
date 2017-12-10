package deck;

class Node<E> {
	E data;
	Node<E> next;
	
	Node() {
		data = null;
		next = null;
	}
	
	Node(E data) {
		this.data = data;
	}

	Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	
	Node(Node<E> n) {
		this.data = n.data;
		this.next = n.next;
	}
}
