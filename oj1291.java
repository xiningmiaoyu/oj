package oj;

import java.util.Scanner;

/*给定区间[M,  N] ，请计算区间中素数的个数。
        输入
        两个正整数M和N。
        输出
        一行，区间中素数的个数。
        样例输入 Copy
        2 11
        样例输出 Copy
        5*/
public class oj1291 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt(),N=sc.nextInt();
        int a=0;
        int b=0;
        for(int i=M;i<=N;i++){
            a=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0) a++;
            }if(a==1) b++;
        }
        System.out.print(b);
        sc.close();
    }
}