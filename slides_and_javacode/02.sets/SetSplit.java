//(c) A+ Computer Science
// www.apluscompsci.com

//using split to load values into a set  

import static java.lang.System.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Arrays;

public class SetSplit
{
	public static void main(String args[])
	{
		String[] words = "aplus comp sci rocks".split(" ");   
		//Set<String> set = new TreeSet<String>(Arrays.asList(words));
		Set<String> set = new HashSet<>(Arrays.asList(words));
		for (String word : words) {
		    System.out.println(word + " " + word.hashCode());
		  }
		System.out.println(set);
	}
}