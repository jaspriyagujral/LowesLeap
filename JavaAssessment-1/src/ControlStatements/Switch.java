package ControlStatements;
/* 
Syntax:

	
	switch(variable)
	{
	case 1:
	   execute code
	break;
	
	case n:
	   execute code
	break;
	
	default:
	   execute code
	break;
	}
	
 */
public class Switch {

		 public static void main(String args[]) {
		  int a = 2;

		  switch (a) {
		   case 1:
		    System.out.println("You chose One");
		    break;

		   case 2:
		    System.out.println("You chose Two");
		    break;

		   case 3:
		    System.out.println("You chose Three");
		    break;
		   
		   default:
			    System.out.println("Invalid Choice. Enter a no between 1 and 3");
			    break;


		  }
	}
}
