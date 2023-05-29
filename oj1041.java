package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1041{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		
    	int ans = 1;
    	for(int i = 1; i <= 1992; i++) {
    		ans = (ans * 1992) % 100;
    	}

			System.out.println(ans);
		
		}
}

