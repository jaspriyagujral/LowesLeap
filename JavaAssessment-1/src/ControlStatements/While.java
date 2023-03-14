package ControlStatements;
/*
Syntax:

		While (condition)
		{
		   statement(s);
		   Incrementation;
		}
 */
public class While {
	   public static void main(String args[]) {
	        int n = 1, times = 5;

	        while (n <= times) {
	            System.out.println("x:" + n);
	            n++;
	        }
	    }
}
