package java_assignment_programs;
import java.util.*;
public class student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
int m1;
int m2;
int m3;
int m4;
int m5;
float total,average;
Scanner scn=new Scanner(System.in);
System.out.println("enter english marks:");
m1=scn.nextInt();

System.out.println("enter maths marks:");
m2=scn.nextInt();

System.out.println("enter telugu marks:");
m3=scn.nextInt();

System.out.println("enter maths marks:");
m4=scn.nextInt();

System.out.println("enter maths marks:");
m5=scn.nextInt();

if(m1>=30)
	System.out.println("english pass");
else
	System.out.println("english fail");

if(m2>=30)
	System.out.println("maths pass");
else
	System.out.println("maths fail");

if(m3>=30)
	System.out.println("telugu pass");
else
	System.out.println("telugu fail");
if(m4>=30)
	System.out.println("telugu pass");
else
	System.out.println("telugu fail");
if(m5>=30)
	System.out.println("telugu pass");
else
	System.out.println("telugu fail");

total=m1+m2+m3;
average= total/3;

System.out.println("total is:"+total);
System.out.println("average is:"+average);
	}

}
