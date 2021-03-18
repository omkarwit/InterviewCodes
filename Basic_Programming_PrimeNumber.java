
public class Basic_Programming_PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP : Prime number

	System.out.println("2 is prime number:" +isPrimeNumber(10));
	
	}
	
}
