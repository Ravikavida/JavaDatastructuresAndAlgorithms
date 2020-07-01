package com.datastructres.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueWordofStringCombination {
	
	public static void main(String[] args) {
		List<String>  list= Arrays.asList("doce","ecod","code","rfamer","merrfa","frame","mefra");
		Map<String,String> map= new LinkedHashMap<>();
		list.stream().forEach(a ->{
			String str = a.chars().mapToObj(c ->(char)c).sorted().collect(Collectors.toList()).toString();
			
			if(!map.containsKey(str))
				map.put(str,a);
		});
		map.forEach((k,v) -> System.out.println(v));;
	}

}
