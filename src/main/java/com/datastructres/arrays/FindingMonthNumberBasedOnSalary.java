package com.datastructres.arrays;

public class FindingMonthNumberBasedOnSalary {

	public int get(int s) {
		
		int rem = s / 100;
		if (rem <= 12) {
			return rem;
		} else {
			int month = rem % 12;
			if (month == 0) {
				return 12;
			} else {
				return month;
			}
		}
	}

	public static void main(String[] args) {

		FindingMonthNumberBasedOnSalary a = new FindingMonthNumberBasedOnSalary();
		int num = a.get(5000);
		System.out.println(num);

	}

}
