package main.java.bean;

public class Node implements Comparable<Node> {
	
	protected String name;
	protected int value;
	
	protected Node previous;
	protected Node next;
	
	public Node(int value) {
		this(String.valueOf(value), value);
	}
	
	public Node(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub
		return this.getValue() - node.getValue();
	}

}
