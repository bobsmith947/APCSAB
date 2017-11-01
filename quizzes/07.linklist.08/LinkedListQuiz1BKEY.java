//© A+ Computer Science
// www.apluscompsci.com  

//linked list quiz 1B key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class LinkedListQuiz1BKEY
{
	public static void main(String[] args)
	{
		out.println("quest 1\n\n");
		String a = "chicken";
		String b = a;
		System.out.println(b);
	
	
		out.println("\n\nquest 2\n\n");		
		String c = "bobcat";
		String d = c;
		c = null;
		System.out.println(d);


		out.println("\n\nquest 3\n\n");			
		String e = "fred";
		String f = new String("fred");
		System.out.println(e==f);

		out.println("\n\nquest 4\n\n");		
		ListNode x = new ListNode("16",
				     new ListNode("34",
				     new ListNode("7",null)));

		
		out.println(x.getValue());
		out.println(x.getNext().getNext().getValue());
		out.println(x.getNext().getValue());
	
		out.println("\n\nquest 5\n\n");			
		ListNode z = new ListNode("four",
			 new ListNode("one",
		       new ListNode("two",
		       new ListNode("three",
			 new ListNode("six",null)))));

		
		while(z!=null)
		{
		     out.println(z.getValue());
		
		     z=z.getNext();
		}


	}
}