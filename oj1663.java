package oj;
import java.util.*;
public class oj1663 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 String str=sc.nextLine();
		        int a=0;
		        int x=0,y=0,z=0;
		        for(int i=0;i<=str.length()-1;i++){
		            a=str.charAt(i);//charAt(in index),返回索引处的char值
		            if(a>=65 && a<=90){
		                x++;
		            }else if(a>=97 && a<=122){
		                y++;
		            }else if(a>=48 && a<=57){
		                z++;
		            }
		        }
		        System.out.print(x+" "+y+" "+z);
		    }
		}

