import java.util.*;
public class LinearSearch
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Enter number of Elements:");
  int n=obj.nextInt();
  System.out.println("Enter array elements:");
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
  {
   arr[i]=obj.nextInt();
  }
  System.out.print("target:");
  int tar=obj.nextInt();
  int result=LinearSearch(arr,n,tar);
     if (result == -1)
         System.out.print(
                 "Element is not present in array");
     else
         System.out.print("Element is present at index "
                 + result);
 }
 public static int LinearSearch(int arr[],int n,int tar)
 {
   for(int i=0;i<n;i++)
   {
    if(arr[i]==tar)
        return i;
   }
     return -1;
 }
}
