package com.eileen;


public class HelloWorld {
	static int i=0;
	public int aMethod() {
		 
		i++;
		return i;
	}
	private void swap() {
		int a =1 ;
		int b =2;
		int c ;
		c=a;
		a=b;
		b=c;
	System.out.println(a);
	System.out.println(b);
		
	}
	
	public void printarray(int[] arr) {
		int len = arr.length;
		for (int j=0;j<len;j++) {
			
			System.out.println(arr[j]);
			
		}
		
	}
	
	
	public int[] addarry(int[] arr1,int[]arr2) {
		int[] sum = new int[4];
		
		
		int len=arr1.length;

		for (int m=0;m<len;m++) {
			  sum[m]=arr1[m]+arr2[m];
			}
		
		return sum;
			 
		
	}
	
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 //testaMethod();
	 //testswap();
	  // testprintarry();
		//testaddarry();
		//testcircle();
		//testrectangle();
		strangeLogic();
	}
	public static void testaMethod() {
		
		HelloWorld test=new HelloWorld ();
		HelloWorld test1=new HelloWorld();
		test1.aMethod();
		test.aMethod();
		int j = test.aMethod();
		System.out.println(j);
		
	}
	public static void testswap() {
		HelloWorld test = new HelloWorld();
		test.swap();
	}
	
	public static void testprintarry() {
		HelloWorld test = new HelloWorld();
		
		int [] testarr = new int[] {1,2,3,4,5};
		
		test.printarray(testarr);
	}
	
	public static void testaddarry() {
		HelloWorld test = new HelloWorld();
		int [] arr1=new int[] {1,2,3,4};
		int [] arr2=new int[] {1,2,3,4};
		int [] arr = test.addarry(arr1, arr2);
		test.printarray(arr);
		
	}
	public static void testcircle() {
		Point p=new Point(1,1);
		Circle test=new Circle(4,p);
		//test.areacacuilation();
		testareacaculation(test);
		//test.perimetercaculation();
		testpcaculation(test);
	}
	
	public static void testrectangle() {
		Rectangle test=new Rectangle(5.0f,5.0f);
		//test.areacalculation(5,5);
		testareacaculation(test);
		//test.perimetercalculation(5,5);
		testpcaculation(test);
		
	}
	public static void testareacaculation(Polygon polygon) {
		polygon.areacaculation();
		
	}
	public static void testpcaculation(Polygon ploydon) {
		ploydon.perimetercaculation();
	}
	
	public static void strangeLogic() {
		Point p=new Point(1.0f,1.0f);
		Circle a = new Circle(2,p);
		Rectangle b = new Rectangle(4,4);
		
		System.out.println(testsum(a));
		testsum(b);
	}
	public static float testsum(Circle a) {
		System.out.println("Circle");
		return a.areacaculation()+a.perimetercaculation();
	}
	public static float testsum(Rectangle a) {
		System.out.println("Rectangle");
		return a.areacaculation()+a.perimetercaculation();
		
	} 
	
	public static float testsum(Polygon a) {
		System.out.println("Polygon");
		return a.areacaculation()+a.perimetercaculation();
	
	}
}