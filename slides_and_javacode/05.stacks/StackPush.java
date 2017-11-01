//(c) A+ Computer Science
// www.apluscompsci.com  

//stack push example

import static java.lang.System.*;
import java.util.Stack;

public class StackPush
{
	public static void main( String args[] )
	{
		Stack<Integer> s;
		s = new Stack<Integer>();
		s.push(55);
		s.push(-45);
		s.push(39);		
		s.push(9);
		System.out.println(s);
	}
}
