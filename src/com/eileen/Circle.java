package com.eileen;

public class Circle  extends Polygon {
	private float radium;
	//private float x ;
	//private float y; 
	 private Point p;
	static final float pi= 3.14f;
public Circle(float radium,Point p) {
	this.radium=radium;
	this.p=p;
}
	
	

 public float perimetercaculation() {
	
	 float  perimeter= 2*radium * pi;
	 System.out.println("The perimeter of the circle is "+perimeter);
	 return perimeter;
 }
 
 public float areacaculation() {
	 float area=pi*radium*radium;
	 System.out.println("The area of the circle is "+area);
	 return area;
 }
 
}
