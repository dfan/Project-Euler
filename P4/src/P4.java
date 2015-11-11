
/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class P4 {
	public static void main(String[] args) {
		int palindrome=0;
		for(int i=1; i<1000; i++){
			for(int j=1; j<1000; j++){
				if((i*j)==reverse(i*j)){
					if((i*j)>palindrome)
					palindrome = i*j; //to find biggest pallindrome and not just the last result
				}
			}
		}
		System.out.println(palindrome);
	}

	public static int reverse(int x) {
		int power = (int)Math.log10(x);
		if(x<10){
			return x;
		}
		else{
			int y=x%10;
			x=(x-y)/10;
			return (int)(y*Math.pow(10,power))+reverse(x);
		}
	
	}
}


