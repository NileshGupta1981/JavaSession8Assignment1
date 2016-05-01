import java.util.ArrayList;
import java.util.Iterator;

public class Session8Assignment1 {
	
	public static void main (String args[]){
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(1);
		a1.add(5);
		a1.add(3);
		a1.add(9);
		
		Iterator<Integer> itr = a1.iterator();
		System.out.println ("Traversing the element");
		
		while (itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
				
	}	
}