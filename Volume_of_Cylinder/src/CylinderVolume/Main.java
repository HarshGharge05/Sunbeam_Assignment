package CylinderVolume;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cylinder c = new Cylinder();
		
		System.out.print("Enter the radius of cylinder : ");
		double radius = sc.nextInt();
		c.setRadius(radius);
		
		System.out.print("Enter the height of cylinder : ");
		double height = sc.nextInt();
		c.setHeight(height);
		
		c.volumeCylinder(radius = c.getRadius(), height = c.getHeight());
		
		c.printVolume(c.getVolume());
		
	}
}
