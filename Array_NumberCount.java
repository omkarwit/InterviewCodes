
public class Array_NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//WAP : Count number of zero in given array
		
		int arr[]= {0, 0, 0, 0, 0};
		int arr_lenght=arr.length;
		int counter=0;
		
		for(int i=0;i<arr_lenght;i++) {
			if(arr[i]==0) {
				counter++;
			}
			else {
				
			}
		}
		System.out.println("Found zero in given array:"+counter);
	}
}

/*
		String foo_string="ab ab ab ab b ab";
		int counter=0;
		String[] splited_string=foo_string.split(" ");
		int spl_lenght=splited_string.length;
		
		for(int i=0;i<spl_lenght;i++) {
			for(int j=i;j<spl_lenght;j++) {
				if(splited_string[i]==splited_string[j]) {
					counter++;
				}	
			}
		}
		System.out.println("Found repetative words:"+counter);
	}
}
*/
