//(c) A+ Computer Science
// www.apluscompsci.com

//pq add example  

import static java.lang.System.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQAdd
{
	public static void main( String args[] )
	{
		PriorityQueue<Integer> pQueue;
		pQueue = new PriorityQueue<Integer>();
		pQueue.add(5);
		pQueue.add(33);
		pQueue.add(8);
		pQueue.add(-5);
		pQueue.add(11);
		System.out.println(pQueue);
	}
}