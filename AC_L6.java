import java.util.*;
public class AC_L6
{
 public static void main(String args[])
 {
     System.out.println("Pattern 10");
   Pattern10();
 }
 public static void Pattern10()
 {
     int n=4;
     for(int i=1;i<=n;i++)
     {
      for(int j=1;j<=i;j++)
      {
          System.out.print("*");
      }
      for(int s=2*(n-i);s>=i;s--)
      {
          System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
          System.out.print("*");
      }
     }
     System.out.println();
 }
}
