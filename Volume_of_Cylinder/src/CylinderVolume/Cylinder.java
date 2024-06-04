package CylinderVolume;

public class Cylinder {
	
	private double radius;
	private double height;
	private double volume;
	
	public void volumeCylinder(double radius, double height) {
		
		this.volume = 3.14*radius*height;
	}
	
	public double getRadius() {
		
		return this.radius;
	}
	
	public void setRadius(double radius) {
		
		this.radius = radius;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		
		this.height = height;
	}
	
	public double getVolume() {
		
		return this.volume;
	}
	
	public void  printVolume(double volume) {
		
		System.out.print("Volume of cylinder is : "+ volume);
	}
}
