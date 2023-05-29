package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1020 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int num[]={a,b,c};
        Arrays.sort(num);
		if(num[0]+num[1]>num[2]){
		System.out.println("Yes");
		}else{
		System.out.println("No");
		}
	}

}