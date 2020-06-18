package com.paypal.second.question.answer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;

public class ReverseParagarphInSameOrder {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Sample Paragraph:input
		String beforeReverse = " used java8 a code evaluation the code evaluation java world java8 java paypal paypal paypal paypal ";
		
		//converted to reverse order and stored in afterReverse varible
		String afterReverse =  String.join(" ", Pattern.compile(" +").splitAsStream(beforeReverse)
		        .collect(LinkedList::new, LinkedList::addFirst, (data,word)->data.addAll(0, word)));
		
		//Splitting String afterReverse
		String words[] = afterReverse.split(" ");
		Map<String,Integer> map = new HashMap<>();
		
		//Traversing throw string array and finding count using merge method.
		for(String word :words) {
			map.merge(word, 1, Integer::sum);
		}
		//as per requirement we need to print count except a,an,the so i'm removing from map
		map.remove("a");
		map.remove("an");
		map.remove("the");
		map.forEach((key,value)->{
			 System.out.println(key+"  "+ value);
		});
		
	}

}
