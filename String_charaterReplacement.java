
public class String_charaterReplacement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP - replace 5 with 0 from given Int
		
		int N=15005551;
		System.out.println("Origina:"+N);
		String new_Str="";
		String abc=String.valueOf(N);
		
		// Method -1 Solution - String replaced 5 to 0.
		String string_replaced=abc.replace('5', '0');
		System.out.println("String Replaced: "+string_replaced);
		
		
		// Method -2 Solution - String iterating and concatenating into one string
		int counter=0;
		int String_len=abc.length();
		System.out.println(String_len);
		
		for(int i=0;i<String_len;i++) {
			
			if(abc.charAt(i)=='5') {
				counter++;
				new_Str=new_Str + '0';
			}
			else {
				new_Str=new_Str + abc.charAt(i);
			}
		}
		System.out.println(Integer.parseInt(new_Str));
		System.out.println("5 digit counter: "+counter);
	}
}
