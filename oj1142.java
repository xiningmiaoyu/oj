package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1142{
	  public static void main(String[] args){
	    	Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<=n-1;i++){
		    	a[i]=sc.nextInt();
		    }
          for(int j=0;j<=n-3;j++){
              if(a[j+1]>a[j]&&a[j+1]>a[j+2]){
                  System.out.println(a[j+1]);
          }
}
}
}