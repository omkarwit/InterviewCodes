public class String_Rotation {

	public static void main(String[] args) {

	//WAP to rotation of String.	
		
	String anyString="Bhalerao";
	int counter=0;
	int anyString_lenght=anyString.length();
	
	StringBuffer anyStringBuffer=new StringBuffer(anyString);
	anyStringBuffer.append(anyString);
	
	for(int i=0;i<anyString_lenght;i++) {
		for(int j=0;j<anyString_lenght;j++) {
			System.out.print(anyStringBuffer.charAt(i+j));
		}
		System.out.println();
		counter++;
	}
	
	System.out.println(counter-1);
	} 
}
