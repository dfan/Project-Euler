/**
 * @(#)P7.java
 *
 * P7 application
 *
 * @author 
 * @version 1.00 2015/4/10
 */

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */

import java.util.ArrayList;
public class P7 {
    public static void main(String[] args) {
    	ArrayList<Integer> prime = new ArrayList<Integer>();
    	prime.add(2);
    	prime.add(3);
    	int counter =0; 
    	int i=4;
    	
    	while(prime.size()<10001){
    		counter=0;
    		for (int j=2; j<=i/2; j++){	
    			if(i%j==0){
    				counter++;
    				break;
    			}
    		}   		
    		if(counter==0){
    			prime.add(i);
    		}
    		i++;
    	}
    	System.out.println(prime.get(10000));
    	}
    }

