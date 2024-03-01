package hexagons;

import java.util.ArrayList;

/*A hexagonal number is computed as follows using the formula: H(n) = n(2n-1)
	As shown, the first 5 hexagonal numbers are: 1 6 15 28 45
	How many of the first 100,000,000 hexagonal numbers are divisible by all the numbers from 1 through 15?
 */

public class Hexagons {
	public static void main(String[] args) {
		long n;
		ArrayList<Long> list = new ArrayList<Long>(); 
		//such a stupid ass big number we needed to use longs instead of ints isnt that crazy
		for(long i=1; i<100000000; i++) {
			n = i;
			n = n*(2*n-1);
			list.add(n);
		}
		//System.out.println(list);
		ArrayList<Long> newlist = new ArrayList<Long>(); 
		//find all the hexagonal numbers below 100,000,000 divisible by all the digits 1-15
		for(int i=0; i<list.size()-1; i++) {
			n = list.get(i);
			/*make boolean condition to check or else it will just print out the amount of times each 
			 * number would be divisible by an integer in the 1-15 range
			 */
			boolean oneToFifteen = true;
			for(int j=1; j<16; j++) {
				if(n%j != 0) {
					oneToFifteen = false;
				}
			}
			//dont forget to use == for if statements
			if (oneToFifteen == true) {
				newlist.add(n);
			}
		}
		System.out.println(newlist.size());

	}

}

//what the fuck