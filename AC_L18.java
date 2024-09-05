import java.util.*;
public class AC_L18
{
    public static void main(String args[])
    {
        int n=5;
        Quest1(n,"S","H","D");
        String str="Ishan";
        Quest2(str,str.length()-1);
        String s="abaacdaefaah";
        Quest3(s,0,'a');
    }
    public static void Quest1(int n,String src,String helper,String dest) //Tower of Hanoi
    {
     if(n==1)
     {
         System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
         return;
     }
     Quest1(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        Quest1(n-1,helper,src,dest);
    }
    public static void Quest2(String str,int idx) //Reverse of a String
    {
     if(idx==0)
     {
         System.out.println(str.charAt(idx));
         return;
     }
        System.out.println(str.charAt(idx));
     Quest2(str,idx-1);
    }
    public static void Quest3(String s,int idx,char element) //First and Last Occurence of the String
    {
        int first=-1;
        int last=-1;
     if(s.charAt(idx)==element)
     {
      if(first==-1)
      {
       first=idx;
      }
      else
      {
        last=idx;
      }
     }
    }
}
