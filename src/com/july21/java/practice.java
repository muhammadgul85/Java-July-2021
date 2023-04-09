package com.july21.java;


class Basic22 {
	public void Method1 ()
	{
		System.out.println(" Simple String Method !!a+b");
	}
}

class Basic23 {
	public void Method3 ()
	{
		System.out.println(" Basic23 Method !!a+b");
	}
}

class simple {
	public void test1 ()
	{
		System.out.println("simple class Test1 Method");
	}
}


public class practice {
	
	public void test() {
		System.out.println("Public Class Method ");
	}
	
	public static void main(String[] args) {
		
		
		int a =1;
		int b =20;
		System.out.println("Multiplication: " +a*b);
		Basic23 t1 = new Basic23();
		Basic22 t2 = new Basic22();
		t1.Method3();
		t2.Method1();
		simple s1 = new simple();
		
		practice p = new practice ();
		p.test();
		s1.test1();
	}

}



//
//package com.javaPgm;
//
//import com.javaPgm.Basic2;
//import com.javaPgm.simple;
//
////Class is the combination of object , constructor and method - that is called class
////Object is blue print of class - Object can be created only if class is available . If we are not declaring the object what is the purpose of declaring class in pgm that is useless
//class simple {
//	public void test1() {
//		System.out.println("Test1 Method");
//	}
//}
//
//public class Basic2 {
//
//	public void test() {
//		System.out.println("test Method");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Basic2 b = new Basic2(); // object creation
//		b.test();
//
//  	 simple s= new simple();
//  	 s.test1();
//		 
//	}
//
//}
