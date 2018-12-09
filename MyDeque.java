
/**
 * Student Name: Abdul Wasay Khan
 * Student ID: 214981104
 * Assignment 2: Ans2
 */

public class MyDeque<E> implements Deque<E>{
	
	private DLLNode<E> header;
	private DLLNode<E> trailer;
	private int size = 0;
	
	public MyDeque(){
		header = new DLLNode<>(null, null, null);
		trailer = new DLLNode<>(null, header, null);
		header.setNext(trailer);
	}
	
	private void addBetween(E e, DLLNode<E> predec, DLLNode<E> succes){
		DLLNode<E> newElement = new DLLNode<>(e, predec, succes);
		predec.setNext(newElement);
		succes.setPrev(newElement);
		size++;
	}
	
	private E remove(DLLNode<E> node){
		DLLNode<E> predec = node.getPrev();
		DLLNode<E> succes = node.getNext();
		predec.setNext(succes);
		succes.setPrev(predec);
		size--;
		return node.getElement();
		}
	
	public boolean isEmpty(){
		return size == 0;
	}

	public int size(){
		return size;
	}

	public void addFirst(E element){
		addBetween(element, header, header.getNext());
	}

	public void addLast(E element){
		addBetween(element, trailer.getPrev(), trailer);
	}

	public E removeFirst(){
		if(isEmpty()){
			return null;
		}
		return remove(header.getNext());
	}

	public E removeLast(){
		if(isEmpty()){
			return null;
		}
		return remove(trailer.getPrev());
	}

	public E first(){
		return header.getElement();
	}

	public E last(){
		return trailer.getElement();
	}

	public void printOutContent(){
		
		DLLNode<E> node = header.getNext();
		if(node.getElement() == null){
			return;
		}
		while(node.getNext().getElement() != null){
			System.out.println(node.getElement() + " ");
			node = node.getNext();
		}
	}

}