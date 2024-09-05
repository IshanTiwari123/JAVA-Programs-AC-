//Percentage Question
import java.util.Scanner;
public class CWH6
{
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       int  sub1=obj.nextInt();
       int sub2=obj.nextInt();
       int  sub3=obj.nextInt();
       int sub4=obj.nextInt();
       int sub5=obj.nextInt();
       float sum=sub1+sub2+sub3+sub4+sub5;
       System.out.println("Total marks"+sum);
       float per=sum/5;
       System.out.println("Percentage="+per+"%");
    }
}

