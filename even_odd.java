
//3.Write a program to accept a number and display whether the number is odd or even using the ternary operator.



package java_assignment_programs;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		String res= a%2==0 ? "even"   :  "odd";
		String res1= a%2!=0 ? "even"   :  "odd";
System.out.println(res);
System.out.println(res1);
	}

}
