package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1024 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int month=sc.nextInt(),day=sc.nextInt(),year=sc.nextInt();
        switch(month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        if(day==31&&month!=12){
        	System.out.println((month+1)+"/1/"+year);
        }else if(day==31&&month==12){
        	System.out.println("1/1/"+(year+1));
        }else{
        	System.out.println(month+"/"+(day+1)+"/"+year);
        }
        break;
        case 4:
        case 6:
        case 9:
        case 11:
        
        if(day==30){
    
        System.out.println((month+1)+"/1/"+year);
        }else{
        System.out.println(month+"/"+(day+1)+"/"+year);
        }
        break;	
        case 2:
       
        if(year%4==0&&year%100!=0||year%400==0){
        if(day==29){
        
                System.out.println((month+1)+"/1/"+year);	
        }else 
        	System.out.println(month+"/"+(day+1)+"/"+year);
        }else{
        	if(day==28){
        		
        	System.out.println((month+1)+"/1/"+year);
        }else{
        	System.out.println(month+"/"+(day+1)+"/"+year);
        }
		}
	}
}
}