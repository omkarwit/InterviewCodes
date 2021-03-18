
public class Reverse_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Method - 1 : Using Algorithm

		int num1=12315;
		int rev=0;
		while(num1 !=0) {
			rev=rev*10+num1%10;
			num1=num1/10;
			System.out.println(rev);
		}
		System.out.println(rev);

// Method -2 : Using StringBuffer //Converted int into String and String into StringBuffer
		
		/*long num2=12345678;
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
		*/
	}
}












