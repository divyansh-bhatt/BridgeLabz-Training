package com.leetcode;
import java.util.*;
public class SameVowelCount {

        public static int countVowel(String str){
            int c=0;
            for(char ch:str.toCharArray()){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')c++;
            }
            return c;
        }
        public static String reverse(String str){
            int n=str.length();
            StringBuilder sb=new StringBuilder();
            for(int i=n-1;i>=0;i--){
                sb.append(str.charAt(i));
            }
            return sb.toString();
        }
        public static String reverseWords(String s) {
            String[]str=s.split(" ");
            int n=countVowel(str[0]);
            for(int i=1;i<str.length;i++){
                if(countVowel(str[i])==n){
                    str[i]=reverse(str[i]);
                }
            }
            return String.join(" ",str);
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println(reverseWords(sc.nextLine()));
        }
    }

