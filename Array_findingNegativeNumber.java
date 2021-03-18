
public class Array_findingNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arry[]= {10,0,20,-1,5,-8,5-8};
		
		// Lenght 
		int leng=arry.length;
		
		// new output array
		int output_arry[]=new int[leng];
		int counter=0;
		int foo=0;
		
		for(int i=0;i<leng;i++) {
			if(arry[i]>=0) {
				// blank
			}
			else {
				//Adding found negative numbers in new array
				output_arry[foo++]=arry[i];
				System.out.println(arry[i]);
				counter++;
			}
		}
		System.out.println("Negative Numbers :"+counter);
	}

}
