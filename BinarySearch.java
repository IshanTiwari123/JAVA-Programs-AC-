
import java.util.*;
public class BinarySearch
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
        int result=BinarySearch(arr,tar);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
    public static int BinarySearch(int[] arr,int tar)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
         int mid=(low+high)/2;
         if(arr[mid]==tar)
         return mid;
         else if(arr[mid]>tar)
            high=mid-1;
         else
             low=mid+1;
        }
        return -1;
    }
}
