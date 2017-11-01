//© A+ Computer Science  -  www.apluscompsci.com

//stacks quiz 1A key  

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class StacksQuiz1AKEY
{
	public static void main(String[] args)
	{
		out.println("quest 1\n\n");
		Stack<Integer> b = new Stack<Integer>();
		b.push(45);
		b.pop();
		b.push(11);
		out.println(b);
		b.pop();
		out.println(b);

		
		out.println("\n\nquest 2\n\n");
		
		
		Stack<Integer> c = new Stack<Integer>();
		c.push(11);
		out.println(c.peek());
		c.push(12);
		out.println(c.pop());
		c.push(13);
		c.push(9);
		out.println(c);

		
		out.println("\n\nquest 3\n\n");		
		
		
		Stack<Double> d = new Stack<Double>();
		d.push(9.5);
		d.pop();
		d.push(3.1);
		d.push(7.8);
		d.pop();
		out.println(d);
		out.println(d.pop());

		
		out.println("\n\nquest 4\n\n");		
		
		Stack<String> e = new Stack<String>();
		e.push("12");
		e.push("ab");
		e.pop();
		e.push("ET");
		out.println(e);
		e.push("go");
		out.println(e.pop());
		out.println(e.size());

		
		
		out.println("\n\nquest 5\n\n");		
		
		Stack<String> f = new Stack<String>();
		f.push("it");
		f.push("run");
		f.push("up");
		f.push("why");
		while(!f.isEmpty()){
		   out.println(f.pop());
		}	


	}
}