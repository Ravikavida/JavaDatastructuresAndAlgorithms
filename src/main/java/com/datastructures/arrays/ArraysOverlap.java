package com.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysOverlap {

	public static void main(String[] args) {

		Integer[][] array= {{6,8},{1,9},{2,4},{4,7}};
		List<Integer[]> list2 = Arrays.asList(array);
		list2.forEach(a->{
			for(int i=1;i<array.length;i++) {
				if(a[0]>array[i][0] && a[0]<array[i][1]) {					
					System.out.println("("+a[0]+","+a[1]+") and ("+array[i][0]+","+array[i][1]+") are overlapping ");
					List<Integer> list = new ArrayList<>(Arrays.asList(a));
					list.addAll(Arrays.asList(array[i]));
					System.out.println(Collections.min(list)+","+Collections.max(list));
				}
			}
		});

	}

	}


