
public class String_junkremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use regular expression: e.g. [^a-zA-Z0-9]
		String s1="1010ABC021D E";
		s1=s1.replaceAll("[^a-zA-Z]","");
		System.out.println(s1);
	}

}
