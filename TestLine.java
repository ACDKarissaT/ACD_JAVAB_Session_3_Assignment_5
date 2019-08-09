package assignment5;

import java.util.Scanner;

public class TestLine {
	public static void main(String[] args) {
		int n = 1; //number of lines to be made;
		
		Line[] lines = new Line[n];
		Point p1;
		Point p2;
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		for (int i = 0; i<n; i++) { //get points
			System.out.print("Enter x: ");
			x = sc.nextInt();
			System.out.print("Enter y: ");
			y = sc.nextInt();
			p1 = new Point();
			p1.setX(x);
			p1.setY(y);
			System.out.print("Enter x: ");
			x = sc.nextInt();
			System.out.print("Enter y: ");
			y = sc.nextInt();
			p2 = new Point();
			p2.setX(x);
			p2.setY(y);
			lines[i] = new Line();
			lines[i].setPoint1(p1);
			lines[i].setPoint2(p2);
		}
		sc.close();
		for (int i= 0; i < n; i++) {
			if (lines[i] != null) {
				System.out.println("Line 1: (" + lines[i].getPoint1().getX() + ", " + lines[i].getPoint1().getY()
						+ ") -> (" + lines[i].getPoint2().getX() + ", " + lines[i].getPoint2().getY() + ")");
			}
		}
		
	}	
}

class Point{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

class Line{
	private Point point1;
	private Point point2;
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	
}
