import java.util.*;
import java.lang.*;
public class AC_L8 //Functions exercise
{
    public static void main(String args[])
    {
        //Question1();
        // Question2();
        //Question3();
        //Question4();
        //Question5();
        //Question7();
        //Question8();
    }
    public static void Question1()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(avg);
    }
    public static void Question2()
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
         if(i%2==1)
         {
          sum=sum+i;
         }
        }
        System.out.println(sum);
    }
    public static void Question3()
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     if(a>b)
     {
         System.out.println("Greater:a="+a);
     }
     else
     {
         System.out.println("Greater:b=10"+b);
     }
    }
    public static void Question4()
    {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double pi=3.14;
        System.out.println("Circumference="+2*pi*radius);
    }
    public static void Question5()
    {
     Scanner obj=new Scanner(System.in);
     int age=obj.nextInt();
     if(age>18)
     {
         System.out.println("Eligible to vote");
     }
     else
     {
         System.out.println("Not Eligible to vote");
     }
    }
    public static void Question7()
    {
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     int a[]=new int[n];
     int zeros=0;
     int pos=0;int neg=0;
     for(int i=0;i<n;i++)
     {
      a[i]=obj.nextInt();
      if(a[i]<0)
      {
          neg++;
      }
      else if(a[i]==0)
      {
        zeros++;
      }
      else
      {
       pos++;
      }
     }
        System.out.println("Zeros"+zeros);
        System.out.println("Negatives"+neg);
        System.out.println("Positives"+pos);
    }
    public static void Question8()
    {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int n = obj.nextInt();
        System.out.println("Power="+Math.pow(x,n));
    }
}
