package prime_factors;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactors {
	public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    int yourNumber = scanner.nextInt();
	ArrayList<Integer> factors = new ArrayList<Integer>(); 

    for(int i=1; i<yourNumber; i++) {
    	int remainder = yourNumber%i;
			if(remainder==0) {
				factors.add(i);
			    }
			}
    //System.out.println(factors);
    
    ArrayList<Integer> primeFactors = new ArrayList<Integer>(factors);
    for(int i=0; i<factors.size(); i++) {
	    for(int j=2; j<factors.get(i); j++) {
	    	if(factors.get(i)%j == 0) {
	    		primeFactors.set(i, null);
	    		j = factors.get(i);
	    		//do something else
	    	}
	    }
    }
    ArrayList<Integer> noNulls = new ArrayList<Integer>();
    for(int i=0; i<primeFactors.size(); i++) {
	    	if(primeFactors.get(i) != null) {
	    		noNulls.add(primeFactors.get(i));
	    	}
    }
	System.out.println(noNulls);
	}

} 

