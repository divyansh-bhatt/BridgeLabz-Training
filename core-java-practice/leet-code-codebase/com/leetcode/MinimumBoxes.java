package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumBoxes {

        public static int minimumBoxes(int[] apple, int[] capacity) {
            Arrays.sort(capacity);
            int sum=0;
            for(int i:apple){
                sum+=i;
            }
            int c=0;
            int l=capacity.length-1;
            while(l>=0){
                if(sum<=0)break;
                sum-=capacity[l];
                c++;
                l--;
            }
            return c;

        }
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[]apples=new int[n];
            int m=sc.nextInt();
            int[]capacity=new int[m];
            for(int i=0;i<n;i++){
                apples[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                capacity[i]=sc.nextInt();
            }
            System.out.println(minimumBoxes(apples,capacity));
    }

}
