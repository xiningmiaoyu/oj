package oj;

import java.util.Scanner;

public class oj1680 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String a =sc.nextLine();
        String b =sc.nextLine();
        a =a.toLowerCase();
        b =b.toLowerCase();
        int pos =b.indexOf(a);
        int x =0;
        while (pos!=-1){
            x++;
            b= b.substring(pos+a.length());
            pos=b.indexOf(a);
        }
        System.out.println(x  );
    }
}
