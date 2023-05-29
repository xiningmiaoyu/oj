package oj;

import java.util.Scanner;

public class oj1048 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String b="AM";
        String c="PM";




        if (t==12){
            String a=sc.nextLine();
            int h=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            if (b.equals(a)){
                System.out.println(h+":"+m+":"+s);
            }else{
                System.out.println(h+":"+m+":"+s);
            }
        }else {
            int h=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
        }





    }

}
