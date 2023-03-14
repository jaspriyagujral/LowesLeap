package Inheritance;

interface X
{
    public abstract void execute1();
}
interface Y
{
    public abstract void execute2();
}
class Z implements X,Y
{
    public void execute1()
    {
        System.out.println("I am from execute1");
    }
    public void execute2()
    {
        System.out.println("I am from execute2");
    }
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Z obj = new Z(); 
		obj.execute1();
		obj.execute2();
	}

}
