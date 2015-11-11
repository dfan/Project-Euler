/**
 * @(#)P6.java
 *
 * P6 application
 *
 * @author 
 * @version 1.00 2015/4/10
 */

/*
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
 
public class P6 {
    public static void main(String[] args) {
    	int sumsquare=0;
    	int squaresum=0;
    	for(int i=1; i<=100; i++){
    		sumsquare=sumsquare+(int)Math.pow(i,2);
    		squaresum=squaresum+i;
    	}
    	squaresum=(int)Math.pow(squaresum,2);
    	System.out.println(squaresum-sumsquare);
    }
}
