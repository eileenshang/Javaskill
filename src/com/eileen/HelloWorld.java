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
		testaddarry();
		
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
	
	
}