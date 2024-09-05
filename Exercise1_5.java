 import java.util.Scanner;
    public class Exercise1_5
    {
        public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
             double mark_avg;
             int result;
             int i;
             int s;
          //define size of array
           s = obj.nextInt();
         //The array is defined "arr" and inserted marks into it.
          int[] arr = new int[s];   
          for(i=0;i<arr.length;i++)
         {
           arr[i]=obj.nextInt();
         }
        }
    }    
