import java.util.*;
public class AC_L7 //Functions
{
   public static void main(String args[])
   {
     Scanner obj=new Scanner(System.in);
       int a=obj.nextInt();
       int b=obj.nextInt();
       System.out.println("Sum="+sum(a,b));
       System.out.println("Product="+product(a,b));
       System.out.println("Factorial="+factorial(a));
   }
   public static int sum(int a,int b)
   {
    int sum= a+b;
    return sum;
   }
    public static int product(int a,int b)
    {
        int product= a*b;
        return product;
    }
    public static int factorial(int a)
    {
     int fact=1;
     if(a==1||a==0)return fact=1;
     for(int i=a;i>1;i--)
     {
      fact=fact*i;
     }
     return fact;
    }
}
