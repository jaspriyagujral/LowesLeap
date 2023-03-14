package Inheritance;


class C 
{
	void m3() {
		System.out.println("I am in C");
	}
}

class D extends C
{
	void m1() {
		System.out.println("I am in D");
	}
}

public class MultilevelInheritance extends D {
	void m2() {
		System.out.println("I am in Multilevel inhertance");
	}

	public static void main(String[] args) {
		MultilevelInheritance a = new MultilevelInheritance();
		a.m1();
		a.m2();
		a.m3();
	}

}
