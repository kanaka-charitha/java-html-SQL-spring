
//2.Write a program to accept three numbers and find the largest of three numbers using ternary operator.



package java_assignment_programs;

public class find_largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		int max=((a>=b) ?(a>=c?a:c):(b>=c?b:c));
		System.out.println("the output max number:"+max);
		}
		}


