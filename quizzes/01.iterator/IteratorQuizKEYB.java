//© A+ Computer Science
// www.apluscompsci.com

//iterator quiz key B  

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorQuizKEYB
{
   public static void main(String args[])
   {
   	//ITERATOR QUIZ 1B

		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(15);
		Iterator<Integer> it = x.iterator();
		System.out.println(it.next());
		System.out.println(it.next());



		out.println("\n\n");



		ArrayList<Integer> w = new ArrayList<Integer>();
		w.add(8);
		w.add(3);
		Iterator<Integer> iter = w.iterator();
		while(iter.hasNext()){
		   System.out.println(iter.next());
		   iter.remove();
		}
		System.out.println(w);

		out.println("\n\n");



		ArrayList<Integer> z;
		z = new ArrayList<Integer>();
		z.add(89);
		z.add(90);
		z.add(89);
		z.add(90);
		z.add(89);
		z.add(new Integer(89));
		System.out.println(z);
		Iterator<Integer> itera = z.iterator();
		while(itera.hasNext()){
		   if(itera.next().compareTo(90)==0)
		     itera.remove();
		}
		System.out.println(z);




		out.println("\n\n");


		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(12);
		a.add(7);
		ListIterator<Integer> iterator = a.listIterator();
		iterator.next();
		iterator.set(99);
		iterator.next();
		iterator.previous();
		iterator.set(33);
		System.out.println(a);
   }
}
