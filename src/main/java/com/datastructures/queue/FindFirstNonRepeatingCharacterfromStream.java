package com.datastructures.queue;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.apache.commons.collections4.map.HashedMap;

public class FindFirstNonRepeatingCharacterfromStream {

	public static void printFirstNonrepeatedChar(char stream[]) {
		Queue<Character> queue = new LinkedList<Character>();
		Map<Character, Integer> map = new HashedMap<>();
		for (int i = 0; i < stream.length; i++) {
			map.put(stream[i], map.getOrDefault(stream[i], 0) + 1);
			if (map.get(stream[i]) == 1) {
				queue.add(stream[i]);
			}
		}

		while (!queue.isEmpty()) {
			char c = queue.peek();
			if (map.get(c) == 1) {
				break;
			} else {
				queue.remove();
			}
		}

		if (queue.isEmpty()) {
			System.out.println(-1 + " ");
		} else {
			System.out.println(queue.peek());
		}

	}

	// second way
	public static char getfirstNonrepeatedchar(char arr[]) {
		String s = "";
		for (char c : arr) {
			s = s + c;
		}
		char result =' ';
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				result = s.charAt(i);
				break;
			}
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		char[] stream = { 'a', 'a', 'b', 'k', 'c', 'c', 'd', 'b', 'a' };

		FindFirstNonRepeatingCharacterfromStream.printFirstNonrepeatedChar(stream);
		FindFirstNonRepeatingCharacterfromStream.getfirstNonrepeatedchar(stream);

	}

}
