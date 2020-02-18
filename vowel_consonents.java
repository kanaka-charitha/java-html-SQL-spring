
//Write a program to accept an alphabet and display whether its a vowel or consonant

package java_assignment_programs;
import java.util.*;
public class vowel_consonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a character : ");
			char ch=sc.next( ).charAt(0);	 		
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
			System.out.println("Entered character "+ch+" is  Vowel"); 
			}
			else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				System.out.println("Entered character "+ch+" is Consonant");
			      else
				System.out.println("Not an alphabet");		
			}
	}

