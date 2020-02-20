import java.util.*;
  public class Demo3{
  public static void main(String[] args) {
  double value = 12.56;
  double fractional_part = value % 1;
  double integral_part = value - fractional_part;  
  System.out.print("\n Original value: "+value);
  System.out.print("\nIntegral part: "+integral_part);
  System.out.print("\nFractional part: "+fractional_part);
  System.out.println();  
  }
}s