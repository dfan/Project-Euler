/**
 * @(#)P5.java
 *
 * P5 application
 *
 * @author 
 * @version 1.00 2015/4/10
 */

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

import java.util.ArrayList;
public class P5 {   
    public static void main(String[] args) { //using prime factors (more efficient albeit longer code
    	ArrayList<Integer> prime = new ArrayList<Integer>();
    	prime.add(2);
    	prime.add(3);
    	int counter =0; 
    	for(int i=4; i<=20; i++){ //creating arraylist of prime numbers
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
    	}
    	
    	int[] primepowers = new int[prime.size()]; //creating an array of the max power for each prime; the answer is the product of each prime raised to its largest power
    	//e.g. in the example: 2520= 2^3 * 3^2 * 5^1 * 7^1
    	int largest = 0;
    	for(int i=2; i<=20; i++){
    		int icopy = i;		 
    		for(int j=0; j<primepowers.length; j++){
    			if(icopy%prime.get(j)!=0 || icopy==1){
    				if(largest>primepowers[j]){
    					primepowers[j]=largest;
    				}   				
    				largest=0;
    				
    			}
    			if(icopy%prime.get(j)==0){
    				icopy=icopy/prime.get(j);
    				largest++;
    				j--;
    			}		
    		}
    	}
    	
    	int product=1;
    	for(int i=0; i<primepowers.length; i++){
    		product=product*(int)(Math.pow((double)prime.get(i), (double)primepowers[i]));
    	}
    	System.out.println(product);
    	
    	
    	
    }
}


/* by brute-force
	int x=1;
		for(int i=1; i<=20; i++){
			if(x%i!=0){
				i=1;
				x++;
			}
		}
 	System.out.println(x);
 	
 */