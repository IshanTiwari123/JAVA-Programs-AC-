import java.util.*;
public class AC_L12 //String
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  String name1= obj.nextLine();
  String name2=obj.nextLine();
  String name3=name1+name2;
  System.out.println("Concatination:"+name3); //Concatination
  System.out.println("Length of name 3:"+name3.length()); //Length of string
     System.out.println(name3.charAt(2));//It will print the alphabet on that index
     System.out.println(name1.equals(name2));//It will check if the strings are same or not
     if(name1.compareTo(name2)==0)
     {
         System.out.println("Strings are equal"); //name1==name2 return 0
     }
     else
     {
         System.out.println("Strings are not equal"); //name1!=name2 return +ve /-ve accordingly
     }
     //Substring
     System.out.println(name1.substring(2,name1.length()));
 }
}
