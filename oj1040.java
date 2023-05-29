package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1040{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
		
		int b=0;
		
		for(int i=1;i<=1000;i++){
		if(i%10==3||(i/10)%10==3||(i/100)%10==3||(i/1000)%10==3){

			b++;
		}
		}
			System.out.println(b);
		
		}
}


