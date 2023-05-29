package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
/*题目描述
		给定区间[M,  N] ，请计算区间中素数的个数。
		输入
		输入只有一行，包括2个整数M、N，之间用一个空格分开。
		输出
		输出只有一行，包括1个整数。
		样例输入 Copy
		1 20
		样例输出 Copy
		8
		提示
		数据规模与约定：
		1 <= M <= N <= 32767
		N - M <= 32767*/
public class oj1135 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		        int M=sc.nextInt(),N=sc.nextInt();
		        int a=0,b=0;
		        for(int i=M;i<=N;i++){
					a=0;
		            for(int j=1;j<=i;j++){
		                if(i%j==0) a++;
		            }if(a==2) b++;
		        }
		        System.out.print(b);
		        sc.close();
		    }
		}

