//© A+ Computer Science
// www.apluscompsci.com

//maps quiz key B   

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Collection;

class MapsQuiz2KEYB
 {
   public static void main(String args[]) 
   {
		//QUIZ 1B

		//Collection a = new Map();		//illegal
		
		Map b = new HashMap();
		
		Map c = new TreeMap();
		
		//Collection d = new TreeMap();		//illegal

		
		Map<String,Integer> mOne = new TreeMap<String,Integer>();
		mOne.put("1",-5);
		mOne.put("2",-6);
		mOne.put("3",-7);
		out.println(mOne.get("2"));
		out.println(mOne.get("5"));
		out.println(mOne.get("3"));
		
		
		out.println("\n\n");
		
		
		Map<String,Integer> mTwo = new TreeMap<String,Integer>();
		mTwo.put("8",2);
		out.println(mTwo.put("8",3));
		mTwo.put("8",4);
		out.println(mTwo.put("5",8));
		mTwo.put("5",9);
		out.println(mTwo.put("5",10));


		out.println("\n\n");

		
		Map<String,Integer> map = new TreeMap<String,Integer>();
		map.put("8",1);
		map.put("8",2);
		map.put("8",3);
		map.put("5",1);
		map.put("6",3);
		map.put("2",5);
		out.println(map);
		

		out.println("\n\n");
		
		
		Map<String,Integer> treeMap;
		treeMap = new TreeMap<String,Integer>();
		String[] list = {"4","5","8","2","2","2","6"};
		for(String s : list)
		   if(treeMap.get(s)==null)
		      treeMap.put(s,1);
		   else
		      treeMap.put(s, treeMap.get(s)+1);
		out.println(treeMap);
   }
}

