//© A+ Computer Science
// www.apluscompsci.com

//maps quiz key A   

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Collection;

class MapsQuiz2KEYA
 {
   public static void main(String args[]) 
   {
		//QUIZ 1A
		//Collection a = new Map();		//illegal
		
		Map b = new TreeMap();
		
		//Collection c = new TreeMap();		//illegal
		
		Map d = new HashMap();


		Map<String,Integer> mOne = new TreeMap<String,Integer>();
		mOne.put("8",1);
		mOne.put("5",2);
		mOne.put("6",7);
		out.println(mOne.get("8"));
		out.println(mOne.get("6"));
		out.println(mOne.get("3"));
		
		
		out.println("\n\n");
		
		
		Map<String,Integer> mTwo = new TreeMap<String,Integer>();
		mTwo.put("8",10);
		out.println(mTwo.put("8",12));
		mTwo.put("8",15);
		out.println(mTwo.put("5",18));
		mTwo.put("5",20);
		out.println(mTwo.put("5",23));


		out.println("\n\n");
		
		Map<String,Integer> map = new TreeMap<String,Integer>();
		map.put("8",6);
		map.put("8",3);
		map.put("8",2);
		map.put("5",9);
		map.put("6",8);
		map.put("2",12);
		out.println(map);
		
		
		out.println("\n\n");
		
				
		Map<String,Integer> treeMap;
		treeMap = new TreeMap<String,Integer>();
		String[] list = {"4","5","8","2","8","8","6"};
		for(String s : list)
		   if(treeMap.get(s)==null)
		      treeMap.put(s,1);
		   else
		      treeMap.put(s, treeMap.get(s)+1);
		out.println(treeMap);
   }
}

