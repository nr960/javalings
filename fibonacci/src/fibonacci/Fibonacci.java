package fibonacci;

public class Fibonacci {

	    public static void main(String[] args) {
	        int x = 0;
	        int y = 1;
	        int z;
	        int sum;

	        int term = 0;
	        //use a do while loop instead of a for loop so you dont have to specify an end condition in case your desired answer is over the end condition 
	        //e.g. if you said i > 200 i++ it would only iterate up to 200
	        do {
	            z = x + y;
	            int num = z;
	            sum = 0;

	            while (num > 0) {
	            	//find the remainder first to isolate the ones place
	                sum += num % 10;
	                //then divide by 10 before running the loop again, to ensure that the next number will shift to the ones place
	                num /= 10;
	            }
	            //find the first term with a sum of digits greater than 50
	            //it's 764848393, or the 59th term- digits add up to 52
	            //the first term with a sum of digits greater than 60 is 887748939/614th 
	            //greater than 70 887988887/824th 
	            if (sum > 70) {
	                break;
	            }
	            
	            //move x to y and then move y to z after x has been moved to y
	            x = y;
	            y = z;

	            term++;

	        } while (true);

	        System.out.println(z + "/" + term + "th ");
	    }
	}
