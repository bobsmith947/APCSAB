//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<String, Set<String>>();
	}

	public void setPersonRelative(String line)
	{
		String[] personrelative = line.split(" ");
		if(map.get(personrelative[0])==null)
		{
			map.put(personrelative[0], new TreeSet<String>());
		}
		map.get(personrelative[0]).add(personrelative[1]);
	}


	public String getRelatives( String person)
	{
		return ""+map.get(person);
	}

	public String toString()
	{
		String output="";
		for( String person : map.keySet())
		{
			output+=person + " is related to ";
			for(String s : map.get(person))
			{
				output+=s + " ";
			}
			output+="\n";
		}
		return output;
	}
}