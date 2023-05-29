package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class oj1045{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String question=sc.next();
        int a=0,b=0,x=0,y=0,num_1=0,num_2=0,sum=0;
        for(int n=0;n<=question.length()-1;n++){
            a=question.charAt(n);
            if(a==43){
                x=n;
                y=question.length()-n-1;
                break;
            }
        }
        int num_list_1[]=new int[x];
        int num_list_2[]=new int[y];

        int i;
        for(i=0;i<=question.length()-1;i++){
            a=question.charAt(i);
            if(a>=48&&a<=57){
                num_list_1[i]=a-48;
            }else{
                break;
            }
        }

        for(int j=i+1;j<=question.length()-1;j++){
            b=question.charAt(j);
            num_list_2[j-(i+1)]=b-48;
        }

        int w=0,u=0;
        for(int m=x-1;m>=0;m--){
            u=(int) Math.pow(10,m);
            num_1=num_list_1[w]*u;
            sum+=num_1;
            w++;
        }

        w=0;
        for(int n=y-1;n>=0;n--){
            u=(int) Math.pow(10,n);
            num_2=num_list_2[w]*u;
            sum+=num_2;
            w++;
        }

        System.out.println(sum);
    }
}