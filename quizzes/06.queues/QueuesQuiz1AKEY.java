//© A+ Computer Science
// www.apluscompsci.com

//queues quiz 1A key  

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class QueuesQuiz1AKEY
{
	public static void main(String[] args)
	{
		out.println("quest 1\n\n");
		Queue<Integer> b = new LinkedList<Integer>();
		b.add(5);
		b.remove();
		b.add(9);
		b.add(17);
		out.println(b);
		out.println(b.remove());

		
		out.println("\n\nquest 2\n\n");		
		
		Queue<Integer> c = new LinkedList<Integer>();
		c.add(7);
		c.add(3);
		out.println(c.peek());
		c.add(5);
		out.println(c.remove());
		c.add(2);
		c.remove();
		out.println(c);

		
		
		out.println("\n\nquest 3\n\n");			
		
		Queue<Double> d = new LinkedList<Double>();
		d.add(1.2);
		d.add(5.3);
		d.add(6.2);
		d.add(4.1);
		out.println(d.remove());
		out.println(d.remove());

		
		
		out.println("\n\nquest 4\n\n");		
		
		
		Queue<String> e = new LinkedList<String>();
		e.add("up");
		e.add("dog");
		e.add("alien");
		out.println(e.remove());
		e.add("fun");
		out.println(e.remove());
		e.add("whoot");
		out.println(e.size());
		out.println(e.remove());


		
		
		out.println("\n\nquest 5\n\n");		
		
		Queue<String> f = new LinkedList<String>();
		f.add("one");
		f.add("two");
		f.add("big");
		f.add("all");
		while(!f.isEmpty()) {
		   System.out.println(f.remove());
		}

		
		
	}
}