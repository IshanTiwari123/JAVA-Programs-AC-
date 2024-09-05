//User input
import java.util.Scanner;
public class CWH5
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a=obj.nextInt();
        System.out.println("Enter number 2:");
        int b=obj.nextInt();
        int sum=a+b;
        System.out.println("Sum: "+sum);
        boolean b1=obj.hasNextFloat();//To check whether the literal is true or not
        System.out.println(b1);
        String name=obj.nextLine(); //next line used to write a whole line
        System.out.println(name);
    }
}
