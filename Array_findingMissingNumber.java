
public class Array_findingMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int a[]= {1,2,3,4,5,7};
		// Sum of present number in array.
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		// All number sum form 1 to 7
		for(int j=1;j<=7;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println("Missing Number: "+(sum1-sum));
	}

}
