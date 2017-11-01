//© A+ Computer Science
// www.apluscompsci.com

//iterator quiz key A  

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorQuizKEYA
{
   public static void main(String args[])
   {
   	//QUIZ 1A

		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(45);
		x.add(21);
		Iterator<Integer> it = x.iterator();
		System.out.println(it.next());
		System.out.println(it.next());



		out.println("\n\n");

		ArrayList<Integer> w = new ArrayList<Integer>();
		w.add(13);
		w.add(17);
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
		   if(itera.next().compareTo(89)==0)
		     itera.remove();
		}
		System.out.println(z);



		out.println("\n\n");


		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(21);
		a.add(11);
		a.add(33);
		a.add(15);
		ListIterator<Integer> iterator = a.listIterator();
		iterator.next();
		iterator.set(99);
		iterator.next();
		iterator.previous();
		iterator.set(33);
		System.out.println(a);
   }
}
