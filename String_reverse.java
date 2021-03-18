
public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sample_String="Selenium";
		
//Method:#001 => Using for loop
		
		/*String reverse_string="";
		int string_lenght=sample_String.length();
		for(int i =string_lenght-1;i>=0;i--) {
			reverse_string=reverse_string+sample_String.charAt(i);
		}
		System.out.println(reverse_string);
	}
*/
		
//Method:#002 => Using StringBuffer built in method		
		StringBuffer sb=new StringBuffer(sample_String);
		String rev_string=sb.reverse().toString();
		System.out.println(rev_string);
		
	}	
}
