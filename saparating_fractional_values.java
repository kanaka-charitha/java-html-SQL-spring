

//1.Write a program to accept a double value. Separate the whole value from the fractional value and store 
//them in two variables. Display the same.



package java_assignment_programs;
import java.util.*;
public class saparating_fractional_values {
	public static void main(String[] args) {
		double value=12.56;
		double fraction_value=value%1;
		double integral_value=value - fraction_value;
		System.out.println("\n original_value:" +value);
		System.out.println("\n fractional_value:" +fraction_value);
		System.out.println("\n integral_value:" +integral_value);
		}
		// TODO Auto-generated method stub

	}
