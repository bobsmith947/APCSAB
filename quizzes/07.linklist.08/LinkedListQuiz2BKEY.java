//© A+ Computer Science
// www.apluscompsci.com  

//linked list quiz 2B key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class LinkedListQuiz2BKEY
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
		ListNode x = new ListNode("8",
				     new ListNode("2",
				     new ListNode("6",null)));
		
		out.println(x.getValue());
		out.println(x.getNext().getNext().getValue());
		out.println(x.getNext().getValue());
		out.println(x.getNext().getNext().getNext());


	
	
		out.println("\n\nquest 2\n\n");		
		ListNode z = new ListNode("slide",
			 new ListNode("speed",
		       new ListNode("slow",
		       new ListNode("dance",
			 new ListNode("skip",null)))));
		
		while(z!=null)
		{
		   out.println(z.getValue());
		   z=z.getNext();
		}




		out.println("\n\nPART 2\n\n");			
		ListNode y = new ListNode(13,
				     new ListNode(11,
				 		new ListNode(18,
				 		new ListNode(12,
				 		new ListNode(19,          
				     new ListNode(22,null))))));
				     
		out.println(countEm(y,12,20));
	}
}