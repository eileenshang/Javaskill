package com.eileen;

public class Rectangle extends Polygon {
	float longth; 
	float width;
	
	public   Rectangle(float longth,float width) {
		this.longth=longth;
		this.width=width;
	}

 

	public float  perimetercaculation() {
		float perimeter =(longth+width)*2;
	  System.out.println(perimeter);
		return perimeter;
	}
	public float areacaculation () {
		float area = longth*width; 
		System.out.println(area);
		return area;
	}
	
	
	
	
}
