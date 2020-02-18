
//14.  Write a program to find the factorial of a number using recursion.




package java_assignment_programs;

public class factorial_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			      int factorial = fact(4);
			      System.out.println("Factorial of 4 is: "+factorial);
			   }
			   static int fact(int n)
			   {
			       int output;
			       if(n==1){
			         return 1;
			       }
			       //Recursion: Function calling itself!!
			       output = fact(n-1)* n;
			       return output;
			   }
			
	}


