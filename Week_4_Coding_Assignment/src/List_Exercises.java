import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class List_Exercises {
	
	// Create an instance of an ArrayList of String called employeeNames
	static List<String> employeeNames = new ArrayList<String>();
	
	// Create an instance of a HashSet of Integer called ids
	static Set<Integer> ids = new HashSet<Integer>();

	// Create an instance of a HashMap of Integer, String called employeeMap
	static Map<Integer, String> employeeMap = new HashMap<Integer, String>();
	
	// Add at least five entries to the employeeNames and ids
	// See main method	
	
	
	
	public static void main(String[] args) {
		
		
		
		/* 1) Create an instance of an ArrayList of String called employeeNames		      
		   2) Create an instance of a HashSet of Integer called ids
		   3) Create an instance of a HashMap of Integer, String called employeeMap
		   4) Add at least five entries to the employeeNames and ids
		   5) Create a variable int i = 0; then iterate over ids using an enhanced for loop. 
		      Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. 
		      The entry should consist of a key that is the id in the enhanced loop’s 
		      current iteration, and a value that is the employeeName at position i of the 
		      employeeNames ArrayList. Increment i so that each iteration grabs the next element in the ArrayList.
		   6) Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(), 
		      and use the key for each current iteration to print to the console both the current key and 
		      its associated value in the map. 
		   7) Create a StringBuilder called idsBuilder
		   8) Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		   9) Print the result of idsBuilder.toString() to the console.
		  10) Create another StringBuilder called namesBuilder 
		  11) Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
		  12) Print the result of namesBuilder.toString() to the console.
		      
		      */
		// Add at least five entries to the employeeNames and ids
		employeeNames.add("Andrew");
		employeeNames.add("Brian");
		employeeNames.add("Jeremy");
		employeeNames.add("John");
		employeeNames.add("Nick");
		
		ids.add(100);
		ids.add(165);
		ids.add(245);
		ids.add(478);
		ids.add(149);
		
		
		/* Question 5: Create a variable int i = 0; then iterate over ids using an enhanced for loop. 
	      Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. 
	      The entry should consist of a key that is the id in the enhanced loop’s 
	      current iteration, and a value that is the employeeName at position i of the 
	      employeeNames ArrayList. Increment i so that each iteration grabs the next element in the ArrayList.*/
		int i = 0;
		String temp = "";
		for( Integer idNum : ids ) {
			temp = employeeNames.get(i);
			employeeMap.put(idNum, temp);
			// System.out.println(employeeMap);
			i ++; 		
		}
		
		// System.out.println(employeeMap) resolves to {1=Andrew, 245=Brian, 14=Jeremy, 15=John, 47=Nick}
		// The ID #'s aren't in the right order
				
		/* Question 6: use another enhanced for loop to iterate over the employeeMap.keySet(), 
		   and use the key for each current iteration to print to the console both the current key and 
		   its associated value in the map. */
		 
		for ( Integer idNum : employeeMap.keySet() ) {
			System.out.println( idNum + " " + employeeMap.get(idNum));
		    }
			
		// Question 7: Create a StringBuilder called idsBuilder 
		
		StringBuilder idsBuilder = new StringBuilder();
				
		// Question 8: Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		for ( Integer id : ids) {
			idsBuilder.append( id + " - ");
			}
		
		// Question 9: Print the result of idsBuilder.toString() to the console.
		System.out.println(idsBuilder.toString());
		
		// Question 10: Create another StringBuilder called namesBuilder
		
		StringBuilder namesBuilder = new StringBuilder();
		
		// Question 11: Iterate over the employeeNames ArrayList and append each name, 
		//              followed by a space “ “ to the namesBuilder.
		for ( String name : employeeNames) {
			namesBuilder.append( name + " ");
			}
		
		// Question 11: Print the result of namesBuilder.toString() to the console 
				
		System.out.println(namesBuilder.toString());
	}

}
