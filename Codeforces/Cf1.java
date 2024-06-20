package Codeforces;

import java.util.Scanner;

public class Cf1 {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i=0;i<t;i++){
            int n=s.nextInt();
            int m=s.nextInt();
            int k=s.nextInt();
            int left[]=new int[n];
            int right[]=new int[m];
            for (int j=0;j<n;j++){
                left[j]=s.nextInt();
            }
            for (int j=0;j<m;j++){

                right[j]=s.nextInt();



            }
            int result=0;
            for(int l=0;l<n;l++){
                for(int r=0;r<m;r++){

                    if(left[l]+right[r]<=k)
                    {
                        result++;
                    }



                }




            }
            System.out.println(result);

        }


    }
}