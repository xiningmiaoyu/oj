package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1117 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a=0;
        int x=0;
        for(int i=0;i<=str.length()-1;i++){
        	a=str.charAt(i);
        	if(a>=65&&a<=90){
        		x++;
        	}
        }
        System.out.print(x);
	}
}