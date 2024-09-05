import java.util.*;
public class AC_L5
{
    public static void main(String[] args)
    {
        System.out.println("Pattern 1");
        Pattern1();
        System.out.println("Pattern 2");
        Pattern2();
        System.out.println("Pattern 3");
        Pattern3();
        System.out.println("Pattern 4");
        Pattern4();
        System.out.println("Pattern 5");
        Pattern5();
        System.out.println("Pattern 6");
        Pattern6();
        System.out.println("Pattern 7");
        Pattern7();
        System.out.println("Pattern 8");
        Pattern8();
        System.out.println("Pattern 9");
        Pattern9();
    }
    public static void Pattern1()
    {
     int n=5;
     for(int i=1;i<=n;i++)
     {
      for(int j=1;j<=n;j++)
      {
          System.out.print("*");
      }
         System.out.println("");
     }
    }
    public static void Pattern2()
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if(i==1||i==n||j==1|j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void Pattern3()
    {
      int n=5;
      for(int i=1;i<=n;i++)
      {
       for(int j=1;j<=i;j++)
       {
           System.out.print("*");
       }
          System.out.println("");
      }
    }
    public static void Pattern4()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void Pattern5()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern6()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void Pattern7()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1 ;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void Pattern8()
    {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++)
        {
         for(int j=1;j<=i;j++)
         {
             System.out.print(count);
             count++;
         }
            System.out.println();
        }
    }
    public static void Pattern9()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            {
                for (int j = 1; j <= i; j++)
                {
                    int s=i+j;
                    if(s%2!=0)
                    {
                        System.out.print("1");
                    }
                    else
                    {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}
