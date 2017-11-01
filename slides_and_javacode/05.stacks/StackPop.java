//(c) A+ Computer Science
// www.apluscompsci.com  

//stack pop example

import static java.lang.System.*;
import java.util.Stack;

public class StackPop
{
	public static void main( String args[] )
	{
		Stack<Integer> s;
		s = new Stack<Integer>();
		s.push(55);
		s.push(-45);
		s.push(39);		
		s.push(9);
		System.out.println("stack before pop :: "+s);
		s.pop();
		System.out.println("stack after pop :: "+s);
	}
}
