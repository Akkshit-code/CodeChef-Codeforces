import java.util.*;
import java.lang.*;
import java.io.*;

class chef1{

    public static int distributecookies(int a , int b){
        if(b%a == 0) return 0;
        else if(b>a  && b%a!=0){
            if(b%a > a/2){
                return a-b%a;
            }
            else{
                return b%a;
            }
        }
        else{
            return Math.abs(a-b);
        }

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(distributecookies(a,b));
        }

    }
}
