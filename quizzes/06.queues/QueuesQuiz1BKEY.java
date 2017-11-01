//© A+ Computer Science
// www.apluscompsci.com

//queues quiz 1B key  

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class QueuesQuiz1BKEY
{
	public static void main(String[] args)
	{
		out.println("quest 1\n\n");
		Queue<Integer> b = new LinkedList<Integer>();
		b.add(11);
		b.remove();
		b.add(8);
		b.add(9);
		out.println(b);
		out.println(b.remove());


		
		out.println("\n\nquest 2\n\n");		
		
		Queue<Integer> c = new LinkedList<Integer>();
		c.add(4);
		c.add(8);
		out.println(c.peek());
		c.add(3);
		out.println(c.remove());
		c.add(7);
		c.remove();
		out.println(c);


		
		
		out.println("\n\nquest 3\n\n");			
		
		Queue<Double> d = new LinkedList<Double>();
		d.add(5.2);
		d.add(3.3);
		d.add(1.2);
		d.add(7.1);
		out.println(d.remove());
		out.println(d.remove());


		
		
		out.println("\n\nquest 4\n\n");		
		
		
		Queue<String> e = new LinkedList<String>();
		e.add("run");
		e.add("pig");
		e.add("goat");
		out.println(e.remove());
		e.add("joy");
		out.println(e.remove());
		e.add("fly");
		out.println(e.size());
		out.println(e.remove());



		
		
		out.println("\n\nquest 5\n\n");		
		
		Queue<String> f = new LinkedList<String>();
		f.add("all");
		f.add("big");
		f.add("one");
		f.add("two");
		while(!f.isEmpty()) {
		   System.out.println(f.remove());
		}	
		
	}
}