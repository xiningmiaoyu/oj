package oj;
import java.lang.*;
import java.util.Scanner;//java.util.*
public class oj1014 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=86){
		System.out.println("VERY GOOD");
		}else if(a>=60&&a<86){
		System.out.println("GOOD");
		}else{
		System.out.println("BAD");
		}
	}

}
