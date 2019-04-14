# Algorithms

package datastructures.linkedlist;

public interface MyIterator {
	
	public boolean hasNext();
	public Node next();

}


package datastructures.linkedlist;

public class MyIteratorImpl{
	
	private MyLinkedList list;
	public MyLinkedList getList() {
		return list;
	}

	public void setList(MyLinkedList list) {
		this.list = list;
	}

	public Node getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(Node currentNode) {
		this.currentNode = currentNode;
	}

	Node currentNode;
	
	public boolean hasNext(){
		return this.currentNode.getNext() != null;
	}
	
	public Node next(){
		return this.currentNode.getNext();
	}

}

package datastructures.linkedlist;

import java.util.Iterator;

public class MyLinkedList {
	
	Node head;
	Node tail;
	
	
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	
	public void addFirst(Node node){
		if(head == null)
		{
			this.head = node;
			this.tail = node;
		
		}else{
			node.setNext(this.head);
			this.head = node;
			
		}
	}
	
	public void removeFirst(){
		if(head == tail)
		{
			this.head = null;
			this.tail = null;
		}else{
			this.head = this.head.getNext();
			
		}
	}
	
	public void addLast(Node node){
		if(tail == null)
		{
			this.head = node;
			this.tail = node;
		}else{
			this.tail.setNext(node);
			this.tail = node;
			
		}
	}
	
	public void removeLast(){
		if(head == tail)
		{
			this.head = null;
			this.tail = null;
		}else{
			Node current = this.head;
			while(current.getNext() != tail){
				current = current.getNext();
			}
			current.setNext(null);
			this.tail = current;
			
		}
	}
	
}

package datastructures.linkedlist;

public class MyMain {

	public static void main(String[] args) {
		Node first = new Node(1);
		Node middle = new Node(2);
		Node end = new Node(3);
		first.setNext(middle);
		middle.setNext(end);
		//printValues(first);
		
		MyLinkedList list = new MyLinkedList();
		list.addFirst(end);
		list.addFirst(middle);
		list.addFirst(first);
		printValues(list);
		System.out.println("******************************");
		list.removeFirst();
		list.addLast(new Node(10));
		printValues(list);
		System.out.println("******************************");
		list.removeLast();
		printValues(list);
		System.out.println("******************************");


	}

	private static void printValues(MyLinkedList list) {
		Node node = list.head;
		while(node != null){
			System.out.println(node.getValue());
			node = node.getNext();
		}
		
	}

	private static void printValues(Node node) {
		while(node != null){
			System.out.println(node.getValue());
			node = node.getNext();
		}
		
	}

}
package datastructures.linkedlist;

public class Node {
	
	private int value;
	private Node next;
	private Node prev;
	
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(int value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}
	public Node(int value) {
		super();
		this.value = value;
	}
	
	

}

package sorting.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] numbers = Utils.generateRandomNumbersArray(10);
		long startTime = System.currentTimeMillis();
		int[] sortedByBubbleSort = bubbleSort(numbers);
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("Time taken for bubbleSort::"+timeTaken);
		Utils.printArray(sortedByBubbleSort);

	}
	
	private static int[] bubbleSort(int[] numbers) {
		int n = numbers.length;
		boolean swapped;
		for(int i=0; i< n; i++){
			//First for loop - handles sorting in multiple passes
			swapped = false;
			for(int j=1; j<n; j++){
				if(numbers[j-1] > numbers[j]){
					swapped = true;
					int temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;					
				}
			}
			
			/*if (swapped == false)
		        break;*/
			Utils.printArray(numbers);
		}
		return numbers;
	}
}

package sorting.algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		
		// Generate random numbers
		int[] numbers = Utils.generateRandomNumbersArray(10);
		long startTime = System.currentTimeMillis();
		insertionSort(numbers);
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("Time taken for InsertionSort::"+timeTaken);
		Utils.printArray(numbers);

	}
	
	private static int[] insertionSort(int[] numbers) {
		int n = numbers.length;
        for (int i=1; i<n; ++i)
        {
            int key = numbers[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && numbers[j] > key)
            {
            	numbers[j+1] = numbers[j];
                j = j-1;
            }
            numbers[j+1] = key;
            Utils.printArray(numbers);
        }
        return numbers;
	}
	
}

package sorting.algorithms;

public class MergeSort {

	public static void main(String[] args) {
		// Generate random numbers
		int[] numbers = Utils.generateRandomNumbersArray(10);
		long startTime = System.currentTimeMillis();
		mergeSort(numbers);
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("Time taken for InsertionSort::"+timeTaken);
		Utils.printArray(numbers);

	}

	private static int[] mergeSort(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

}

package sorting.algorithms;

public class QuickSort {

	public static void main(String[] args) {
		// Generate random numbers
		int[] numbers = Utils.generateRandomNumbersArray(10000);
		long startTime = System.currentTimeMillis();
		quickSort(numbers);
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("Time taken for InsertionSort::"+timeTaken);
		Utils.printArray(numbers);

	}

	private static int[] quickSort(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

}

package sorting.algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		// Generate random numbers
		int[] numbers = Utils.generateRandomNumbersArray(1000);
		long startTime = System.currentTimeMillis();
		selectionSort(numbers);
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("Time taken for InsertionSort::"+timeTaken);
		Utils.printArray(numbers);

	}

	private static int[] selectionSort(int[] numbers) {
		int n = numbers.length;
		boolean swapped;
		for(int i=0; i< n; i++){
			//First for loop - handles sorting in multiple passes
			swapped = false;
			for(int j=1; j<n; j++){
				if(numbers[j] < numbers[j-1]){
					swapped = true;
					int temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;					
				}
			}
			
			if (swapped == false)
		        break;
			Utils.printArray(numbers);
		}
		return numbers;
	}

}

package sorting.algorithms;

public class Utils {
	
	public static int[] generateRandomNumbersArray(int size) {
		int[] numbers = new int[size];
		for(int i=0;i<size; i++){
			numbers[i] = (int) (Math.random()*size);
		}
		return numbers;
	}
	
	public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
