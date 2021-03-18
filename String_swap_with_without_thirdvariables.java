
public class String_swap_with_without_thirdvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x=10;
		int y=20;
		int temp;

		
/*		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swap value of x:"+x +"After swap value of y: "+ +y);
*/
		
// WAP swapping without using third variable
		x=x+y; //10+20
		y=x-y; //30-20
		x=x-y; //30-10 
		
		System.out.println("After swap value of x:"+x +"After swap value of y: "+ +y);
	}

}
