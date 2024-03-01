package distant_twins;

import java.util.ArrayList;

/*The pair 3,5
	 is special as it is the first prime pair to have difference of two. (Twin primes) After this, comes pair 5,7
	. The distance between these two pairs is 2
	 as it is calculated by subtracting the first member of each pair. Under 100
	, the pair 59,61
	 has the longest length from such previous pair 41,43
	 with the distance of 18
	.
	Find longest distance of such prime pair, each member below one million, from such previous pair.
 */

public class DistantTwins {
	
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>(); 
		
		for(int i = 2; i<100; i++) {
			//pass i as an argument into the isPrime method
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		//System.out.println(primes);
		
		//don't duplicate primes, just make a new array (so don't pass anything in at the end)
		ArrayList<Integer> distantTwins = new ArrayList<Integer>(); 
		/*primes.size() - 1 so you don't get an out of bounds exception 
		 * b/c there will be no nextprime to check once you reach the last one
		 */
		for(int i=1; i<primes.size() - 1; i++) {
			//int prevprime = primes.get(i-1);
			int curprime = primes.get(i);
			int nextprime = primes.get(i+1);
			if(nextprime - curprime == 2) {
				distantTwins.add(curprime);
				distantTwins.add(nextprime);
			}
		}
		//System.out.println(distantTwins);
		//new array list for distant twin differences;
		ArrayList<Integer> twinDiffs = new ArrayList<Integer>(); 
		for(int i=1; i<distantTwins.size() - 1; i++) {
			int prevtwin = distantTwins.get(i-1);
			//int curtwin = distantTwins.get(i);
			int nexttwin = distantTwins.get(i+1);
			int diff = nexttwin - prevtwin;
				twinDiffs.add(diff);
			}
		//System.out.println(twinDiffs);
		
		//get the biggest difference between twin pairs
	    //hint, it's the distant twin pairs 41,43 and 59,61 with a difference of 18

		//initialize biggestDiff outside of the loop so it doesn't get re-initialized every time
		int biggestDiff = 0;

		for(int i=0; i<twinDiffs.size() -1; i++) {
			int currentDiff = twinDiffs.get(i);
			if(currentDiff > biggestDiff) {
				biggestDiff = currentDiff;
			}
			}
		System.out.println("Biggest difference: " + biggestDiff);

		}
			//fix why it's printing 12 AND 18 and then print out the twin pair it's between
			/*output should say "The biggest difference is between the twin pairs 41,43 and 59,61
			 * with a difference of 18
			 */
			
		//methods can be defined in any order
		public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i < num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

