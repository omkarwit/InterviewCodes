
public class Array_largest_smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {-10,24,50,-88,3772822};
		
		int largest =numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		System.out.println("Largest Value:"+largest);
		System.out.println("Smallest Value:"+smallest);
		
	}

	
	// Finding 2nd highest number:
		/*int array_size=numbers.length;
		int temp;
		for(int i=0;i<array_size;i++) {
			for(int j=i+1;j<array_size;j++) {
				if(numbers[i]<numbers[j]) {
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
				}
			}
		}
		System.out.println("Second Largest Number in array :" +numbers[array_size-2]);
	}*/
}
