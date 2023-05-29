package oj;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class oj1042{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int year= sc.nextInt();
    	int month= sc.nextInt();
    	int day=sc.nextInt();
    	int week[]={1,2,3,4,5,6,7};
    	int a=0,February=0,y=0,sum=0;
    	for(int i=1980;i<year;i++){
    		if(year>1980){
    		if(i%4==0&&i%100!=0||i%400==0){
    			a+=366;
    	}else{
    		    a+=365;
    	}
    }
    	}
    if(year%4==0&&year%100!=0||year%400==0){
        February=29;
    }else{
        February=28;
    }
    switch(month){
    case 1:
        y=day;
        break;
    case 2:
        y=31+day;
        break;
    case 3:
        y=31+February+day;
        break;
    case 4:
        y=31+February+31+day;
        break;
    case 5:
        y=31+February+31+30+day;
        break;
    case 6:
        y=31+February+31+30+31+day;
        break;
    case 7:
        y=31+February+31+30+31+30+day;
        break;
    case 8:
        y=31+February+31+30+31+30+31+day;
        break;
    case 9:
        y=31+February+31+30+31+30+31+31+day;
        break;
    case 10:
        y=31+February+31+30+31+30+31+31+30+day;
        break;
    case 11:
        y=31+February+31+30+31+30+31+31+30+31+day;
        break;
    case 12:
        y=31+February+31+30+31+30+31+31+30+31+30+day;
        break;
}
    sum=a+y;
    System.out.println(week[sum%7]);
}

} 

    
    
    
    
    
    
    
    
    
    
    
    
    
  