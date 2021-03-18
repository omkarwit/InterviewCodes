import java.util.Arrays;

public class Array_AlternativeString {

	public static void main(String[] args) {
		//WAP : To Alternate String. 
		
		int arr[]= {10,20,30,40,50,60,70};
		int arr_lenght=arr.length;
		
		Arrays.sort(arr);
		
		 int i = 0, j = arr_lenght-1; 
	        while (i < j) { 
	            System.out.print(arr[j--] + " "); 
	            System.out.print(arr[i++] + " "); 
	        } 
	       
	        // If the total element in array is odd  
	        // then print the last middle element. 
	        if (arr_lenght % 2 != 0) 
	            System.out.print(arr[i]); 
		
		
	}

}
