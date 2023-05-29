
package oj;
import java.lang.*;
import java.util.*;
public class oj1018{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=num%10;
		int b=num%100/10;
		int c=num%1000/100;
        int d[]={a,b,c};
        Arrays.sort(d);//按从小到大排列
        for(int i=2;i>=0;i--){
            System.out.print(d[i]);//循环
        }
    }
}
