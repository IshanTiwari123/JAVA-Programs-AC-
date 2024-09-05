import java.util.*;
public class Array2D
{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter Rows:");
     int rows=in.nextInt();
     System.out.println("Enter Columns");
     int cols=in.nextInt();
     //Quest1(rows,cols);
     Quest2(rows,cols);
    }
    public static void Quest1(int rows,int cols)
    {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[rows][cols];
     for(int i=0;i<rows;i++)
     {
      for(int j=0;j<cols;j++)
      {
       a[i][j]=in.nextInt();
      }
     }
     for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void Quest2(int rows,int cols)
    {
     Scanner in=new Scanner(System.in);
     System.out.print("Enter target element:");
     int target=in.nextInt();
        int a[][]=new int[rows][cols];
        System.out.println("Enter Elements:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(a[i][j]==target)
                {
                    System.out.println("It is found at index:"+i+j);
                }
            }
                System.out.print("It is not found");
        }
    }
}
