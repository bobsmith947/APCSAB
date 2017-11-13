//(c) A+ Computer Science
// www.apluscompsci.com  

//basic map example 1

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class BasicMapOne
{
	public static void main(String args[])
	{
		Map<Integer,String> map;
		map = new TreeMap<Integer,String>();
		//map = new HashMap<>();
		map.put(2,"aplus");
		map.put(1,"comp");
		map.put(3,"sci");
		map.put(6,"is");
		map.put(5,"the");
		map.put(4,"best");
		
		System.out.println(map.get(1));
		System.out.println(map.get(5));
		System.out.println(map.get(7));
		System.out.println(map.keySet());
		System.out.println(map);
	}
}