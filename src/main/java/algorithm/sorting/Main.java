package main.java.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

import main.java.bean.Node;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Node> nodeList = new ArrayList<>();
		nodeList.add(new Node(5));
		nodeList.add(new Node(3));
		nodeList.add(new Node(7));
		nodeList.add(new Node(2));
		nodeList.add(new Node(9));
		nodeList.add(new Node(4));
		nodeList.add(new Node(6));
		nodeList.add(new Node(1));
		
		List<Node> sortedList = SelectionSort.sort(nodeList);
		
		for (Node node: sortedList) {
			System.out.println("node: " + node.getValue());
		}
	}

}
