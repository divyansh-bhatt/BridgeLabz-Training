package com.leetcode;
import java.util.*;
public class StringCompression {
    public static int compress(char[] chars) {
        int i=0,count=1;
        for(int j=1;j<=chars.length;j++){
            if(j==chars.length || chars[j]!=chars[j-1]){
                chars[i++]=chars[j-1];
                if(count>=2) {
                    for(char digit:Integer.toString(count).toCharArray()) {
                        chars[i++]=digit;
                    }
                }
                count=1;
            }else{count++;}
        }
        return i;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch[]=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=sc.nextLine().charAt(0);
        }
        System.out.println(compress(ch));
    }
}
