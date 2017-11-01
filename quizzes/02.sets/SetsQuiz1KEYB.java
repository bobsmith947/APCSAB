//© A+ Computer Science
// www.apluscompsci.com

//sets quiz key B  

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

class SetsQuiz1KEYB
 {
   public static void main(String args[]) 
   {
		//SETS QUIZ 1B
		Set<Integer> s = new TreeSet<Integer>();
		s.add(98);
		s.add(98);
		s.add(80);
		out.println(s);
		
		
		out.println("\n\n");
		
		
		Set<String> set = new TreeSet<String>();
		set.add("580");
		set.add("580");
		set.add("70");
		out.println(set);
		

		out.println("\n\n");
		
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("580");
		treeSet.add("580");
		treeSet.add("70");
		out.println(treeSet.add("70"));
		out.println(treeSet.add("190"));
		

		out.println("\n\n");		
		
		
		Set<String> stringSet = new TreeSet<String>();
		stringSet.add("580");
		stringSet.add("580");
		stringSet.add("70");
		stringSet.add("70");
		stringSet.add("190");
		stringSet.add("34");
		out.println(stringSet);
   }
}

