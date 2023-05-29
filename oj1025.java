package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;//java.util.*
public class oj1025 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        //√Î
        if(time<60){
        	if(time>=0&&time<10){                        //00:00:0x
        		System.out.println("00:00:0"+time);
        	}else{
        		System.out.println("00:00:"+time);}}     //00:00:xx
        //∑÷£∫√Î
        else if(time>=60&&time<3600){
        	if(time>=60&&time<600){
        		if(time%60<10){
        		System.out.println("00:0"+(time/60)+":0"+(time%60));       //00:0x:0x
        		}else{
        		System.out.	println("00:0"+(time/60)+":"+(time%60));}       //00:0x:xx
        	}else if(time>=600&&time<3600){
        		if(time%60<10){
        		System.out.println("00:"+(time/60)+":0"+(time%60));         //00:xx:0x
        		}else{
        		System.out.println("00:"+(time/60)+":"+(time%60));} }       //00:xx:xx	
        // ±£∫∑÷£∫√Î
        }else if(time>=3600&&time<36000){
        	if((time/60)%60<10&&(time/60)%60>=0){                          
        		if(time%60>=0&&time%60<=10){
        		System.out.println("0"+(time/3600)+":0"+(time/60)%60+":0"+(time%60));   //0x:0x:0x
        		}else{
        	    System.out.println("0"+(time/3600)+":0"+(time/60)%60+":"+(time%60));}    //0x:0x:xx
        	}else{
        		if(time%60>=0&&time%60<=10){
        		System.out.println("0"+(time/3600)+":"+(time/60)%60+":0"+(time%60));	 //0x:xx:0x
        		}else{
        		System.out.println("0"+(time/3600)+":"+(time/60)%60+":"+(time%60));}}	 //0x:xx:xx
        }else if(time>=36000){
            	if((time/60)%60<10&&(time/60)%60>=0){                          
            		if(time%60>=0&&time%60<=10){
            		System.out.println((time/3600)+":0"+(time/60)%60+":0"+(time%60));   //xx:0x:0x
            		}else{
            	    System.out.println((time/3600)+":0"+(time/60)%60+":"+(time%60));}    //xx:0x:xx
            	}else{
            		if(time%60>=0&&time%60<=10){
            		System.out.println((time/3600)+":"+(time/60)%60+":0"+(time%60));	 //xx:xx:0x
            		}else{
            		System.out.println((time/3600)+":"+(time/60)%60+":"+(time%60));}	 //xx:xx:xx		
            	}
        }
	}
}