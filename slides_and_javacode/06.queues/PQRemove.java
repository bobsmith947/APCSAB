//(c) A+ Computer Science
// www.apluscompsci.com

//pq remove example  

import static java.lang.System.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQRemove
{
	public static void main( String args[] )
	{
		PriorityQueue<Integer> aplus;
		aplus = new PriorityQueue<Integer>();
		aplus.add(-6);
		aplus.add(40);
		aplus.add(12);
		aplus.add(22);
		System.out.println(aplus);
		System.out.println(aplus.remove());
		System.out.println(aplus);
	}
}