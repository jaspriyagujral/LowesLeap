package Inheritance;

class B 
{
	void m1() {
		System.out.println("I am in B");
	}
}

public class SingleInheritance extends B {
	void m2() {
		System.out.println("I am in Single inhertance");
	}

	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.m2();
		s.m1();
		

	}

}
