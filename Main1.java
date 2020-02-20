import java.util.*;
public class Main1 {
	  public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int summ=0,rem=0;
	    while(n>0){
	      int remm = n%10;
	      if(rem%2!=0){
	        summ = summ+remm;
	      }
	      n = n/10;
	    }
	    
	    if(summ%2==0){
	      System.out.println("Sum of odd digits is even");
	    }else{
	      System.out.println("Sum of odd digits is odd");
	    }
	}
}
