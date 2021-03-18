
public class Basic_Factorial {

/// Method 1 : Using simple for loop
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
		int numb=2;
		
		for(int i=1;i<=numb;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Of: "+fact);
		
	}*/

	
// Method 2 : Using Recursion 
	
	
	static int factorial(int n){
		if(n==0) {
			return 1;
		}
		else {
			return (n*factorial(n-1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int i,fact=1;
	int numb=5;
	fact=factorial(numb);
	System.out.println(fact);	
	}	
}
