package oj;
import java.lang.*;
import java.util.*;
public class oj1017{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int num[]={a,b,c};
        Arrays.sort(num);//按从小到大排列
        for(int i=2;i>=0;i--){
            System.out.print(num[i]+" ");//循环
        }
    }
}
