
//4.Write a program to accept three numbers and find the largest and second largest values of three numbers


package java_assignment_programs;

public class largest_secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		if(a>b&&a>c) 
		if(b>c)
			System.out.println("second largest number:"+b);
			else
			System.out.println("second largest number:"+c);
			
		if(b>a&&b>c)	
			if(a>c)
			System.out.println("second largest number:"+a);
			else
			System.out.println("second largest number:"+c);
			
		if(c>a&&c>b)
			if(b>a)
				System.out.println("second largest number:"+b);
			else
				System.out.println("second largest number:"+a);
		}

	}



