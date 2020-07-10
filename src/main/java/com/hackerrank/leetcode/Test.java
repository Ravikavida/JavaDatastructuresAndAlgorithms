package com.hackerrank.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {

		List<Sales> list = new ArrayList<>();
		Sales s = new Sales();
		s.setSalesname("abc");
		s.setStorevalue(2);

		Sales s1 = new Sales();
		s1.setSalesname("abc");
		s1.setStorevalue(18);

		Sales s2 = new Sales();
		s2.setSalesname("xyz");
		s2.setStorevalue(34);

		Sales s3 = new Sales();
		s3.setSalesname("lmn");
		s3.setStorevalue(23);

		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);

		ArrayList<Sales> newlist = new ArrayList<>();

		Map<String, Integer> map = new HashMap<>();
		for (Sales sa : list) {
			if (map.containsKey(sa.getSalesname())) {
				map.put(sa.getSalesname(),
						map.getOrDefault(sa.getSalesname(), sa.getStorevalue()) + sa.getStorevalue());

				Sales sal = new Sales();
				sal.setSalesname(sa.getSalesname());
				sal.setStorevalue(map.get(sa.getSalesname()));
				newlist.add(sal);
			} else {
				map.put(sa.getSalesname(), sa.getStorevalue());
				Sales sal = new Sales();
				sal.setSalesname(sa.getSalesname());
				sal.setStorevalue(map.get(sa.getSalesname()));
				newlist.add(sal);

			}
		}
		Comparator<Sales> cmp = (Sales k, Sales l) -> l.getStorevalue() .compareTo(k.getStorevalue());
		Collections.sort(newlist,cmp);
		newlist.stream().limit(3).forEach(data -> {
			System.out.println(data.getStorevalue() + " " + data.getSalesname());
		});
	}

}
