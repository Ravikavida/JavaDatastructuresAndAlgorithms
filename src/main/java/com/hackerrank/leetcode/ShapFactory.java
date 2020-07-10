package com.hackerrank.leetcode;

public class ShapFactory {

	public void drawShape(String type) {
		if (type == "square") {
			new Square().drawShape();
		} else if (type == "circle") {
			new Circle().drawShape();
		} else if (type == "rectangle") {
			new RectAngle().drawShape();
		} else
			System.out.println("Drawing " + type + " is not supported");
	}

	public static void main(String[] args) {

		ShapFactory fa = new ShapFactory();
		fa.drawShape("square");

	}

}
