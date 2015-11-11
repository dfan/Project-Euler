/**
 * @(#)P9.java
 *
 * P9 application
 *
 * @author 
 * @version 1.00 2015/4/11
 */

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class P9 {    
    public static void main(String[] args) {
    	for (int a=1; a<1000; a++){
    		for (int b=1; b<1000-a; b++){ // since a+b+c has to equal 1000 there's no point looping b to 1000 as well
    			int c=1000-a-b;
    			if (a*a + b*b == c*c){
    				System.out.println(a*b*c);
    			}
    		}
    	}
    }
}
