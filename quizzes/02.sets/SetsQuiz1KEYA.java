//© A+ Computer Science
// www.apluscompsci.com

//sets quiz key A  

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

class SetsQuiz1KEYA
 {
   public static void main(String args[]) 
   {
		//SETS QUIZ 1A
		Set<Integer> s = new TreeSet<Integer>();
		s.add(89);
		s.add(89);
		s.add(90);
		out.println(s);
		
		out.println("\n\n");
		
		
		Set<String> set = new TreeSet<String>();
		set.add("890");
		set.add("890");
		set.add("90");
		out.println(set);
		
		
		out.println("\n\n");		
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("890");
		treeSet.add("890");
		treeSet.add("90");
		out.println(treeSet.add("90"));
		out.println(treeSet.add("190"));
		
		
		out.println("\n\n");		
		
		Set<String> stringSet = new TreeSet<String>();
		stringSet.add("890");
		stringSet.add("890");
		stringSet.add("90");
		stringSet.add("90");
		stringSet.add("190");
		stringSet.add("34");
		out.println(stringSet);
   }
}

