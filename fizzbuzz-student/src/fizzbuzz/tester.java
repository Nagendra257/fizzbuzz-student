package fizzbuzz;

public class tester {
  public static void main(String[] args) {
	  boolean fiz=false;
		boolean buz=false;
		int temp;
		int fizzNumber=3;
		int buzzNumber=4;
		int k=45;
		while(k!=0) {
			temp=k%10;
			k=k/10;
			if(temp==fizzNumber||45%fizzNumber==0){
				fiz=true;
			}
			 if(temp==buzzNumber||45%buzzNumber==0){
				buz=true;
			}
		}
		if(fiz==true&&buz==true) {System.out.println("fizzbuzz");}
		else if(fiz==true) {System.out.println("fizz");}
		else if(buz==true){System.out.println("buzz");}
		else {System.out.println("not found");}
  }
}
