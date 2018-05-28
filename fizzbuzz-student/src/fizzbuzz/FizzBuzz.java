package fizzbuzz;

public class FizzBuzz {
	private final int fizzNumber;
	private final int buzzNumber;

	/**
	 * Construct an object that can compute fizzbuzz values for a game of Fizz and
	 * Buzz.
	 * 
	 * @param fizzNumber:
	 *            an integer between 1 and 9
	 * @param buzzNumber:
	 *            an integer between 1 and 9
	 */
	public FizzBuzz(int fizzNumber, int buzzNumber) {
		this.fizzNumber = fizzNumber;
		this.buzzNumber = buzzNumber;
	}

	/**
	 * Returns the fizzbuzz value for n. The rules are:
	 * - if n is divisible by fizzNumber, or contains the digit fizzNumber, return "fizz" 
	 * - if n is divisible by buzzNumber, or contains the digit buzzNumber, return "buzz"
	 * - however, if both the above conditions are true, you must return "fizzbuzz"
	 * - if none of the above conditions is true, return the number itself.
	 *
	 * For example, getValue(1) returns "1".
	 * 
	 * @param n: a positive integer
	 * @return the fizzbuzz value, as a String
	 * 
	 */
	public String contain(int d) {
		boolean fiz=false;
		boolean buz=false;
		int temp;
		int k= d;
		while(d!=0) {
			temp=d%10;
			d=d/10;
			if(temp==fizzNumber||k%fizzNumber==0){
				fiz=true;
			}
			 if(temp==buzzNumber||k%buzzNumber==0){
				buz=true;
			}
			 if (fiz==true&&buz==true) {break;}
		}
		if(fiz==true&&buz==true) {return "fizzbuzz";}
		else if(fiz==true) return "fizz";
		else if(buz==true)return "buzz";
		else return "not Found";
	}
	
	public String getValue(int n) {
		if((n%fizzNumber==0 && n%buzzNumber==0)||contain(n).equals("fizzbuzz")) {return "fizzbuzz";}
		else if(n%fizzNumber==0||contain(n).equals("fizz")) return "fizz";
		else if(n%buzzNumber==0||contain(n).equals("buzz")) return "buzz";
		else return Integer.toString(n); // return the number itself as a String
	}

	/**
	 * Returns an array of the fizzbuzz values from start to end, inclusive.
	 * 
	 * For example, if the fizz number is 3 and buzz number is 4,
	 * getValues(2,6) should return an array of Strings:
	 * 
	 * {"2", "fizz", "buzz", "5", "fizz"}
	 * 
	 * @param start
	 *            the number to start from; start > 0
	 * @param end
	 *            the number to end at; end >= start
	 * @return the array of fizzbuzz values
	 */
	public String[] getValues(int start, int end) {
		String[] values = new String[end-start+1];
		for(int i=0;i<values.length;i++) {
			values[i]=getValue(start++);}
		return values;
	}
}
