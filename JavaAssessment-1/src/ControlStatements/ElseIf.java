package ControlStatements;
/*
Syntax:
		if(expression)
		{
		   //execute code
		}
		else if(expression n)
		{
		   //execute code
		}
		else
		{
		   //execute code
		}

 */
public class ElseIf {
	public static void main(String args[]) {
        int a = 30, b = 30;

        if (b > a) {
            System.out.println("b is greater");
        }
        else if(a > b){
            System.out.println("a is greater");
        }       
        else {
            System.out.println("Both are equal");
        }
    }

}
