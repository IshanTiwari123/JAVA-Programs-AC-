public class easy2 
{
 int x,y=30,z=20;
 public void add()
 {
  x=y+z;
  System.out.println("Add="+x);  
 }
 public void sub()
 {
  x=y-z;
  System.out.println("Sub="+x);  
 }
 public static void main(String args[])
 {
  easy2 obj=new easy2();
  obj.add();
  obj.sub();  
 }   
}
