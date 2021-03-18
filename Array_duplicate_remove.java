import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Array_duplicate_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Java","Python","Java","Python","Java","Ruby"};
		
// 1. compare each element  => Time complexcity => O(n x n) => worst soln as time complexity is high.
		/*for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate found => " +names[i]);
				}
			}
		}*/

// 2. Hashset => have unique value		
		Set<String> name_string = new HashSet<String>();
		for (String nam : names) {
			if(name_string.add(nam) == false) {
				System.out.println("Duplcate element => " +nam);
			}
			else {
				name_string.add(nam);
			}
		
		}
	}
}










