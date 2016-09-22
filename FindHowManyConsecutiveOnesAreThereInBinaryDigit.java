package com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindHowManyConsecutiveOnesAreThereInBinaryDigit  {
	public static ArrayList<Integer> binaryConverter(int a){
		int k=a;
		int r=0;
		ArrayList<Integer> b=new ArrayList<>();
		if(k==0){
			b.add(0);
		}
		while(k>=1){
			if(k==1){
				b.add(1);
				k=0;
			}
			 if(k>1){
				r=k%2;
				b.add(r);
				k=k/2;
			}
			
		}
		
		return b;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        binaryConverter(n);
        for (int i = binaryConverter(n).size()-1; i >=0; i--) {
			System.out.println(binaryConverter(n).get(i));
		}
    	System.out.println();
        
       int temp=0;
        ArrayList<Integer> tempBablu=new ArrayList<>();
       /* Collections.sort(binaryConverter(n));*/
        for (int i = binaryConverter(n).size()-1; i >=0; i--) {
        	
			if(binaryConverter(n).get(i)==1){
				temp++;
				tempBablu.add(temp);
				
			}
			if(binaryConverter(n).get(i)!=1){
			
				tempBablu.add(temp);
				temp=0;
			}
			
			
					}
        
       
        int max=0;
       for (int i = 0; i <tempBablu.size(); i++) {
    	   /* System.out.println(tempBablu.get(i));*/
		if(tempBablu.get(i)>=max){
			max=tempBablu.get(i);
			/*System.out.println(max);*/
		}
	}
      System.out.println(max);
       
			
		}
    }

