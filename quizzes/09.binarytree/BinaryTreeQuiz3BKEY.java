//© A+ Computer Science  
// www.apluscompsci.com

//binary tree quiz key

import static java.lang.System.*;

class TreeFunHouse
{
   public static int countNodes(TreeNode t)
   {
   	if(t!=null)
   	{
   	  return 1 + countNodes(t.getLeft())+countNodes(t.getRight());	
   	}
   	return 0;
   }
}

public class BinaryTreeQuiz3BKEY
{
   public static void main( String args[] )
   {
   	out.println("Quest 1");
		TreeNode x = new TreeNode(12,
					new TreeNode(88, null,null),
					new TreeNode(6, null,null));
		
		
		out.println(x.getValue());
		out.println(x.getLeft().getValue());
		out.println(x.getRight().getValue());

		


   	out.println("\n\nQuest 2");
		TreeNode y = new TreeNode("50",
			new TreeNode("dog", 
		            new TreeNode("15", null,null),
		            new TreeNode("cat", null,null)),
			new TreeNode("BIRD", null,null));
			
				
		out.println(y.getValue());
		out.println(y.getLeft().getValue());
		out.println(y.getRight().getValue());
		out.println(y.getLeft().getRight().getValue());
		out.println(y.getRight().getLeft());	
	




   	out.println("\n\nQuest 3");		
		out.println("\n\n"+TreeFunHouse.countNodes(x));					
   }
}