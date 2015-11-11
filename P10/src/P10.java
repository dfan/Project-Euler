/*
		The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		Find the sum of all the primes below two million.
*/

import java.util.ArrayList;
public class P10 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2); list.add(3);
		for(int i=5; i<2000000; i+=2){
			int j=2;
			while(i%j!=0 && j<=(int)Math.sqrt(i)){ // all subsequent factors after the square root are factors * a factor. So if everything before sqrt is prime then the number if prime too
				j++;
			}
			j--;
			if(j==(int)Math.sqrt(i)){
				list.add(i);
			}
		}
		long primesum = 0L;	
		for(int i=0; i<list.size(); i++){
			primesum += list.get(i);
		}
		System.out.println(primesum);
	}
}
