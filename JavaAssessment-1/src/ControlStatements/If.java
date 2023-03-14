package ControlStatements;
/* Control Statements: The statements that control the execution flow of a program

Syntax:
	
	    if(expression)
	    {
	    	statement 1;
	    	statement 2;
	    }
	
	*/
public class If {
	public static void main(String[] args) {
		int x=30;
		if(x>20) {
			System.out.println("x is smaller than 20");
		}
		System.out.println("Outside if block");
	}

}
