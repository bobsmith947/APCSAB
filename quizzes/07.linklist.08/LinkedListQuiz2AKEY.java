//© A+ Computer Science
// www.apluscompsci.com  

//linked list quiz 2A key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class LinkedListQuiz2AKEY
{
	//method countEm will return the count of all nums>b and <c
	public static int countEm(ListNode list, Comparable b, Comparable c)
	{
	  int count=0;
	  while(list!=null)
	  {
	  	 Comparable val = list.getValue();
	    if(val.compareTo(b)>0&&val.compareTo(c)<0)
	      count++;
	    list=list.getNext();
	  }
	  return count;
	}
		
		
	public static void main(String[] args)
	{
		out.println("quest 1\n\n");
		ListNode x = new ListNode("3",
				     new ListNode("1",
				     new ListNode("5",null)));
		
		out.println(x.getValue());
		out.println(x.getNext().getNext().getValue());
		out.println(x.getNext().getValue());
		out.println(x.getNext().getNext().getNext());

	
	
		out.println("\n\nquest 2\n\n");		
		ListNode z = new ListNode("run",
			 new ListNode("fly",
		       new ListNode("stop",
		       new ListNode("jump",
			 new ListNode("hop",null)))));
		
		while(z!=null)
		{
		   out.println(z.getValue());
		   z=z.getNext();
		}



		out.println("\n\nquest 3\n\n");			

		out.println("\n\nquest 4\n\n");		
		ListNode y = new ListNode(13,
				     new ListNode(11,
				 		new ListNode(18,
				 		new ListNode(12,
				 		new ListNode(19,          
				     new ListNode(22,null))))));
				     
		out.println(countEm(y,12,20));
	}
}