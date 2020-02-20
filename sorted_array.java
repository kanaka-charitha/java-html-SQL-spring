package assignment1_java;
import java.util.Scanner;
public class sorted_array 
{
public static void main(String[] args) 
{
int n;
String temp;
Scanner scn=new Scanner(System.in);
System.out.print("enter the number of members you want:");
n=scn.nextInt();

String names[]=new String[n];
Scanner scn1=new Scanner(System.in);
System.out.println("enter the names:");
for(int i=0; i<n;i++) {
names[i]=scn1.nextLine();
//System.out.println("index:"+i);
//for(int i=0;i<n-1;i++) {
	//System.out.println("index:"+i);
//}
}
for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++) {
	 if(names[i].compareTo(names[j])>0) {
		 temp=names[i];
		 names[i]=names[j];
		 names[j]=temp;
	 }
	}
}
System.out.println("names in sorted order:");
for(int i=0;i<n-1;i++) {
	System.out.println("index:"+i);
	System.out.println(names[i]+",");
	//System.out.println("index:"+i);
}
System.out.println(names[n-1]);
//System.out.println("index:"+i);
}
}
/*class UserMainCode{
	public static void main(String[] args) {
		sorted_array sa=new sorted_array();
		System.out.println("in sortedorder");
	}
}*/

