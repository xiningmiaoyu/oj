package oj;/*题目描述
        从控制台输入行号n,控制台输出如下结构的星星。
        如果n是6，那么输出的结构如下：
        ******
        *****
        ****
        ***
        **
        *

        输出


        样例输入 Copy
        6
        样例输出 Copy
        ******
        *****
        ****
        ***
        **
        *
        */

import java.util.Scanner;

public class oj1530 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        for(int j=n;j>0;j--) {
              a--;
            for (int i =a; i >0; i--) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
