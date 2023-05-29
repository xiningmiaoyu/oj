package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1139{
    	  public static void main(String[] args){
    	    	Scanner sc=new Scanner(System.in);
    			int n=sc.nextInt();
    		    int a[]=new int[n];
    		    int sum=0;
    		    
    		    for(int i=0;i<=n-1;i++){
    		    	a[i]=sc.nextInt();
    		    	sum+=a[i];
    		    }
    		    double m=(double)sum/n;
    			System.out.println("AV="+String.format("%.1f",m));
    			for(int i=0;i<=n-1;i++){
    		    	
    			    	if(m<a[i]){
    			    	System.out.print(i+1+":"+a[i]+" ");
    			
    			
  
}
}
    	  }

}