import java.util.*;
public class AC_L14 //Operators and Binary number system
{
    public static void main(String args[])
    {
        byte a= (byte)1010;
        byte b=(byte)0110;
        byte c= (byte)(a&b);
        int d=a|b;
        int e=a^b;
        int f=~a;
        int g=a<<1;
        int h=a>>1;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
