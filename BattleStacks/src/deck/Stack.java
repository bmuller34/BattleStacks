package deck;


/**
 * 
 * @author Brian Muller & Matthew Foster
 *
 * The reason this project exists. The crux of this
 * program will revolve of this Data Structure.
 */
public class Stack<E> {
	private LinkedList<E> stack;

	public Stack() {
		stack = new LinkedList<E>();
	}

	public void push(E data) {
		stack.add(data, 0);
	}

	public E pop() {
		E data = stack.remove(0);
		return data;
	}

	public E peek() {
		if (stack.getSize() > 0)
			return stack.get(0);
		else return null;
	}

	public int getSize() {
		return stack.getSize();
	}
}