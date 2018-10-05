package main.java.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

import main.java.bean.Node;

public class SelectionSort {
	
	public static List<Node> sort(List<Node> unsortedList) {
		List<Node> sortedList = new ArrayList<>();
		
		while (unsortedList.size() > 0) {
			int indexOfMin = 0;
			for (int i = 1; i < unsortedList.size(); i++) {
				if (unsortedList.get(indexOfMin).compareTo(unsortedList.get(i)) > 0) {
					indexOfMin = i;
				}
			}
			sortedList.add(unsortedList.remove(indexOfMin));
		}
		
		return sortedList;
	}

}
