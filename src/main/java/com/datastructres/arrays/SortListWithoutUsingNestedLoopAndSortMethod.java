package com.datastructres.arrays;

import java.util.ArrayList;
import java.util.List;

public class SortListWithoutUsingNestedLoopAndSortMethod {

	public static List<Integer> sortList(ArrayList<Integer> list){
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i)>list.get(i+1)) {
				int temp = list.get(i);
				list.set(i,list.get(i+1)) ;
				list.set(i+1, temp);
				i= -1;
			}
		}
		return list;
	}
	public static void main(String[] args) {
		ArrayList < Integer > arraylist = new ArrayList < Integer > ();
		arraylist.add(20);
		arraylist.add(-1);
		arraylist.add(-4);
		arraylist.add(-3);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(2);
	List<Integer> k =	SortListWithoutUsingNestedLoopAndSortMethod.sortList(arraylist);
	System.out.println(k);
	

	}
}