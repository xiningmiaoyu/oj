package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1026 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int d=sc.nextInt(),e=sc.nextInt(),f=sc.nextInt();
		if (a==d&&b==e){
			if(c>=f){
				System.out.println("No");
			}else{
				System.out.println("Yes");
		    }
	    }else if(a==d&&b!=e){
	    	if(b>e){
	    		System.out.println("No");
	    	}else{
	    		System.out.println("Yes");
	    	}
	    }else{
	    	if(a>d){
	    		System.out.println("No");
	    	}else{
	    		System.out.println("Yes");
	    	}
	
		}
	}
}