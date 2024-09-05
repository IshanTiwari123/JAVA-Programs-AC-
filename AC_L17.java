import java.util.*;
public class AC_L17 //Recursion 1
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     int sum=0;
     int i=1;
//     Quest1(n);
//        Quest2(n);
//        Quest3(i,n,sum);
//        int ans=Quest4(n);
//        System.out.println(ans);
//        System.out.println(Quest5(n));
        int  x=obj.nextInt();
//        System.out.println(Quest6(x,n));
        System.out.println(Quest7(x,n));
    }
    public static void Quest1(int n)
    {
     if(n<1) return;
        System.out.println(n);
        Quest1(n-1);
    }
    public static void Quest2(int n)
    {
        if(n==6) return;
        System.out.println(n);
        Quest2(n+1);
    }
    public static void Quest3(int i,int n,int sum)
    {
        if(i>n)
        {
         System.out.println(sum);
         return;
        }
        sum=sum+i;
        System.out.println(i);
        Quest3(i+1,n,sum);
    }
    public static int Quest4(int n) //Factorial
    {
        if (n == 1||n==0 )
        {
            return 1;
        }
        int fact=n*Quest4(n-1);
        return fact;
    }
    public static int Quest5(int n) //Fibonacci Series
    {
     if(n<=1) return n;
     return Quest5(n-1)+Quest5(n-2);
    }
    public static int Quest6(int x,int n) //x^n stack height=n
    {
     if(x==0)
     {
         return 0;
     }
     if(n==0)
     {
         return 1;
     }
     int powerxn=x*Quest6(x,n-1);
     return powerxn;
    }
    public static int Quest7(int x,int n) //x^n stack height=log(n)
    {
        if(x==0)
        {
           return 0;
        }
        if(n==0)
        {
         return 1;
        }
        if(n%2==0)
        {
         int powerxn=Quest7(x,n/2)*Quest7(x,n/2);
         return powerxn;
        }
        else
        {
         int powerxn=x*Quest7(x,n/2)*Quest7(x,n/2);
            return powerxn;
        }
    }
}

