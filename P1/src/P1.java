/**
 * @(#)P1.java
 *
 * P1 application
 *
 * @author 
 * @version 1.00 2015/3/12
 */

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

import java.util.ArrayList; 
public class P1 {
    public static void main(String[] args) {
    	int sum=0;
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	for(int i=0;i<1000;i++){
    		if(i%3==0 || i%5==0){
	    		int counter=0;
	    		for(int j: array){
	    			if(i==j){
	    				counter++;
	    			}
	    		}
	    		if(counter==0){ //to prevent double counting numbers both divisible by 3 and 5
	    			array.add(i);
	    		}
    		}
    	}
    	
    	for(int i=0; i<array.size();i++){
    		sum=sum+array.get(i);
    	}	
    	System.out.println(sum);
    }   
}
