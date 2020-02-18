package java_assignment_programs;
import java.util.Scanner;
public class sum_of_odd_numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int number, i, oddSum = 0;
		Scanner	scn = new Scanner(System.in);
				
				System.out.print(" Please Enter any Number : ");
				number = scn.nextInt();	
				
				for(i = 1; i <= number; i++)
				{
					if(i % 2 != 0)
					{
						oddSum = oddSum + i; 
					}
				}
				System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
			}
	}


