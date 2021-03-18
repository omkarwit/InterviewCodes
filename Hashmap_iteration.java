import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// WAP hashmap iteration using while and Advanced for loop
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "Omkar");
		hashmap.put(3, "Pranali");
		hashmap.put(2, "Mrudul");
		hashmap.put(4, "Pranay");
		hashmap.put(5, "Jr-1");
		
		System.out.println(hashmap.size());
		
		Iterator itr=hashmap.entrySet().iterator();
		while(itr.hasNext()) {
			//Map.Entry me=(hashmap.Entry) itr.next();
			System.out.println(itr.next());
			//System.out.println(me.getKey() +" "+me.getValue());
		}
		
		/*System.out.println("For Loop:");
        for(Map.Entry me2: hashmap.entrySet()) {
            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
        }*/
	}
}
