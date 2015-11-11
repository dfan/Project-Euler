/**
 * @(#)P3.java
 *
 * P3 application
 *
 * @author 
 * @version 1.00 2015/3/12
 */

//What is the largest prime factor of the number 600851475143 ? 
public class P3 {
    public static void main(String[] args) {
    	long factor=600851475143l;
    	for(int i=2; i<factor; i++){
    		if(factor%i==0){
    			factor = factor/i; //if a number is a factor, you can divide by it to simplify things
    			i--;
    		}
    	}
    	System.out.println(factor);
}
}


/*
long factor=0l;
    	long counter=0l;
    	long i=2l;
    	while(i<600851475143l/2){
    		if(600851475143l%i==0){
    			long j=i;
    			while(j>1){
	    			if(i%j==0){
		    			counter++;
		    			j--;
		    		}	
    			}
    		if(counter==0){
    				factor=i;
    			}
    		i++;
    	}
    }
	System.out.println(factor);
 
 */