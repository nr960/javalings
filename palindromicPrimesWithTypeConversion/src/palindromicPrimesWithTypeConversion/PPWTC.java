package palindromicPrimesWithTypeConversion;

import java.util.ArrayList;

public class PPWTC {
	//paswg
	
		public static void main(String[] args) {
			ArrayList<Integer> primes = new ArrayList<Integer>(); 
			
			for(int i = 2; i<1000; i++) {
				//pass i as an argument into the isPrime method
				if(isPrime(i)) {
					primes.add(i);
				}
			}
			
			ArrayList<Integer> palindromicPrimes = new ArrayList<Integer>(); 
			int n;
			String temp;
			for(int i=0; i<primes.size(); i++) {
				n = primes.get(i);
				//make temp an empty string inside the loop so it always starts fresh
				temp = "";
				//convert n to a string so it can be compared with temp
				String n2 = Integer.toString(n);
				for(int j=0; j<n2.length(); j++) {
					temp=n2.charAt(j)+temp;
					/* for n2 = 123, the character at index 0 is 1 (the first character in the string)
					 * it adds the character at the 0th index to the empty string temp, temp now equals "1"
					 * next, it adds the character at the 1st index (in this case 2) to temp, temp equals "21"
					 * next, it adds the character at the 2nd index (in this case 3) to temp, temp equals "321"
					 * the character at index 0 in the first string is now be index 2 in the new string
					 * however, you only need to compare the strings and convert one string back to an integer
					 */
				}
				if(temp.equals(n2)) {
					//convert it back to an int so it can be added to the array list
					int n3=Integer.parseInt(n2);
					palindromicPrimes.add(n3);
				}
			}
			
			System.out.println(palindromicPrimes);
			int total = 0;
			for(int i=0; i<palindromicPrimes.size(); i++) {
				total = total+palindromicPrimes.get(i);
			}
			System.out.println(total);
		}	
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

