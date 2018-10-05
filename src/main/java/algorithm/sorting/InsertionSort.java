package main.java.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

import main.java.bean.Node;

public class InsertionSort {
	
	public static List<Node> sort(List<Node> unsortedList) {
		List<Node> sortedList = new ArrayList<>();
		
		for (int i = 0; i < unsortedList.size(); i++) {
			Node unsortedNode = unsortedList.get(i);
			for (int j = 0; j <= sortedList.size(); j++) {
				if (j >= i || sortedList.get(j).compareTo(unsortedNode) > 0) {
					sortedList.add(j, unsortedNode);
					break;
				}
			}
		}
		return sortedList;
	}
	
}