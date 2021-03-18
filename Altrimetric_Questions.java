import java.util.HashMap;

import javax.swing.plaf.SliderUI;

public class Altrimetric_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Pattern Program :
// ****		
// ***	
// **
// *
		/*for(int i=4;i>0;i--) {
			for(int j=i;j>0;j--) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
*/
		
		
/*		  
		"This This This is is is is is Pooja Pooja"
		​wap to get a count of repeated words 
		​o/p: This-3,is-5,Pooja-2
*/
		
/*		String names="This This This is is is is is Pooja Pooja";
		int counter1=1;
		
		String[] splited_space=names.split(" ");
		
		for(int i=0;i<splited_space.length;i++) {
			for(int j=i+1;j<splited_space.length;j++) {
				if(splited_space[i].equals(splited_space[j])) {
					counter1=counter1+1;
					splited_space[j]="0";
				}
			}
			if(splited_space[i]!="0") {
				System.out.println(splited_space[i]+"--"+counter1);
				counter1=1;
			}
		}
			
*/	
		
		String names="This This This is is is is is Pooja Pooja";
		String[] splited_string=names.split(" ");
		
		HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
		for(int i=0;i<splited_string.length;i++) {
			if(hashmap.containsKey(splited_string[i])) {
				int count=hashmap.get(splited_string[i]);
				hashmap.put(splited_string[i],count+1);
			}
			else {
				hashmap.put(splited_string[i], 1);
			}
		}
		
		System.out.println(hashmap);
		System.out.println(hashmap.toString().replace("{","").replace("}","")); // for replacing => '{' '}' in string.	
	}
}



	
