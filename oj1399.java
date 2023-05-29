package oj;

import java.util.Scanner;

/*题目描述
        从键盘输入n个整数，输出为其平均值。
        输入
        两行。
        第1行为整数个数n，n的大小不会超过10。
        第2行为n个整数。
        输出
        一个整数，表示平均值。
        样例输入 Copy
        5
        3 4 0 0 2
        样例输出 Copy
        1*/
public class oj1399 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b[]=new int[a];
        int c=0;
        for(int i=0;i<=a-1;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<=a-1;i++){
            c=c+b[i];
        }
        System.out.println(c/a);
    }
}
