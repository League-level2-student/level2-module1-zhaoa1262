package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList <String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("tree");
		strings.add("fern");
		strings.add("bush");
		strings.add("bird");
		strings.add("flower");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < strings.size() ; i++) {
			String sstrings = strings.get(i);
			if(strings.contains("e")) {
			System.out.println(sstrings);
			}
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		for(int i = strings.size()-1; i >= 0 ; i--) {
			String sstrings = strings.get(i);
			//if(i%2 == 1) {
			System.out.println(sstrings);
			//}
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
