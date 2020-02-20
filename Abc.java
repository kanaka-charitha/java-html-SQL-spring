import java.util.Scanner;
public class Abc{
public static void main(String [] args){
Scanner scn=new Scanner(System.in);
System.out.println("enter the grade:");
char grade=scn.nextLine();
switch(grade){
case 'A' :
          System.out.println("excellent");
            break;
case 'B' :
           System.out.println("good");
             break;

case 'C' :
           System.out.println("pass");
            break;
 case 'D' :
           System.out.println("border pass");
            break;
case 'F' :
          System.out.println("fail");
            break; 
default : 
        System.out.println("enter valid input");
}
}
}
