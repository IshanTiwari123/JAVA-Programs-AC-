import java.util.Scanner;
public class Array
{
 public static void main(String[] args)
 {Scanner sc=new Scanner(System.in);
//    Quest2();
    System.out.println();
    System.out.println("Enter the value that is to be searched:");
    int tar=sc.nextInt();
    Quest1(tar);
 }
 public static void Quest2()
 {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] marks=new int[n];
     for(int i=0;i<n;i++)
     {
         marks[i]=sc.nextInt();
     }
     for(int i=0;i<marks.length;i++)
     {
         System.out.print(" "+marks[i]);
     }
 }
 public static void Quest1(int tar)
 {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] a=new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++)
     {
      if (a[i]==tar)
      {
          System.out.printf("Target is found at %d", i);
          break;
      }
     }
 }
}
