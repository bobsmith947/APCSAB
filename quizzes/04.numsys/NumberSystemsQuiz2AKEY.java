//© A+ Computer Science
// www.apluscompsci.com

//number systems quiz 2A key  

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.Integer.*;

public class NumberSystemsQuiz2AKEY
{

   public static void main( String args[] ) throws Exception
   {

		out.println("question 1\n\n");


	 	System.out.println(Integer.toString(parseInt("1111",2),9));



		out.println("question 2\n\n");


	 	System.out.println(Integer.toString(parseInt("1001",2),8));



		out.println("question 3\n\n");
		

	 	System.out.println(Integer.toString(parseInt("10101001",2),13));



		out.println("question 4\n\n");


	 	System.out.println(Integer.toString(parseInt("00010001",2),5));
	 	


		out.println("question 5\n\n");
		

	 	System.out.println(Integer.toString(parseInt("01011001",2),6));



		out.println("question 6\n\n");


	 	System.out.println(Integer.toString(parseInt("321",4),3));



		out.println("question 7\n\n");


	 	System.out.println(Integer.toString(parseInt("102",3),7));



		out.println("question 8\n\n");


	 	System.out.println(Integer.toString(parseInt("34",5),16));




		out.println("question 9\n\n");

	
	 	System.out.println(Integer.toString(parseInt("76",8),13));

	 	


		out.println("question 10\n\n");


	 	System.out.println(Integer.toString(parseInt("2134",6),9));



		out.println("question 11\n\n");


		int sum = parseInt("345",6) + parseInt("234",6);
	 	System.out.println(Integer.toString(sum,6));



		out.println("question 12\n\n");


		sum = parseInt("175",9) + parseInt("258",9);
	 	System.out.println(Integer.toString(sum,9));


		out.println("question 13\n\n");


		int diff = parseInt("375",9) - parseInt("258",9);
	 	System.out.println(Integer.toString(diff,9));


		out.println("question 14\n\n");


		diff = parseInt("345",6) - parseInt("234",6);
	 	System.out.println(Integer.toString(diff,6));

	 	
 	}
}

