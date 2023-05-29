package oj;

import java.util.*;
public class oj1064{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt(),r2=sc.nextInt(),r3=sc.nextInt(),r4=sc.nextInt();
        int[] result={r1,r2,r3,r4};
        int[] level={0,0,0,0};
        for(int i=0;i<=3;i++){
            if(result[i]>=90) level[0]+=1;
            else if(result[i]>=75 && result[i]<90) level[1]+=1;
            else if(result[i]>=60 && result[i]<75) level[2]+=1;
            else level[3]+=1;
        }
        if(level[3]!=0) System.out.print("Poor LanYangYang");
        else if(level[0]>=0 && level[0]<4) System.out.print(level[0]);
        else if(level[0]==4) System.out.print(5);

    }
}