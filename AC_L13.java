import java.util.*;
public class AC_L13 //String Builder
{
 public static void main(String args[])
 {
  StringBuilder sb=new StringBuilder("Ishan");
  System.out.println(sb);
  System.out.println(sb.charAt(3)); //charAt is used to print the character at given index
  sb.setCharAt(0,'Z'); //setCharAt is used to replace the character
  sb.append(" Tiwari"); //sb.append is used to add string to the previous string
  System.out.println(sb);
  sb.insert(1,'i'); //sb.insert will insert a char. at given index
  System.out.println(sb);
  sb.delete(6,13);
  System.out.println(sb);
  reverse();
 }
 public static void reverse()
 {
  StringBuilder sg=new StringBuilder("Hello");
  for(int i=0;i<sg.length()/2;i++)
  {
   int front=i;
   int back=sg.length()-1-i;
   char frontchar=sg.charAt(front);
   char backchar=sg.charAt(back);
   sg.setCharAt(front,backchar);
   sg.setCharAt(back,frontchar);
  }
  System.out.println(sg);
 }
}
