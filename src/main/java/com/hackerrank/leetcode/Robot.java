package com.hackerrank.leetcode;

public class Robot {

	public Integer currentX;
	public Integer currentY;
	public Integer previousX;
	public Integer previousY;

	public Robot(int x, int y) {

	}

	public void moveX(int dx) {
		System.out.println(this.currentX + dx + " " + this.currentY);
	}

	public void moveY(int dy) {
		System.out.println(this.currentX + " " + this.currentY + dy);
	}

	public void printCurrentCoordinates() {
		System.out.println(this.currentX + "  " + this.currentY);
	}

	public void printLastCoordinates() {
		System.out.println(this.previousX + "  " + this.previousY);
	}
	public void printLastMove() {
		
	}

	public static void main(String[] args) {

	}

}
