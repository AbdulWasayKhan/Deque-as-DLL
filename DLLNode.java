
/**
 * Student Name: Abdul Wasay Khan
 * Student ID: 214981104
 * Assignment 2: Ans2
 * 
 */

public class DLLNode<E> {

	private E element;
	private DLLNode<E> prev;
	private DLLNode<E> next;

	public DLLNode(E e, DLLNode<E> p, DLLNode<E> n) {
		element = e;
		prev = p;
		next = n;
	}

	public E getElement() {
		return element;
	}

	public DLLNode<E> getPrev() {
		return prev;
	}

	public DLLNode<E> getNext() {
		return next;
	}

	public void setPrev(DLLNode<E> p) {
		prev = p;
	}

	public void setNext(DLLNode<E> n) {
		next = n;
	}

	public void setElement(E e) {
		element = e;
	}

}
