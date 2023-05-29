package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1031 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++){
		    sum*=i;
	}
	System.out.println(sum);
	}
}