package assignment1_java;
import java.util.Scanner;
public class odd_number {
	public static void main(String[] args) {
	int n,i,oddsum=0;
	Scanner scn=new Scanner(System.in);	
	System.out.println("enter the any number:");
	n=scn.nextInt();
	for(i=1;i<n;i++) {
		if(i%2!=0) {
		oddsum=oddsum+i;
	}
	}
	System.out.println("the sum of odd numbers:");

}
}
