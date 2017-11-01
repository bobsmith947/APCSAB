//© A+ Computer Science
// www.apluscompsci.com  

//add and print tree example

import static java.lang.System.*;

class TreeFunHouse
{
	//method countLeaves will count how many leaves are present in tree t
	public static int countLeaves(TreeNode t)
	{
		if(t==null)
			return 0;
		else if(isLeaf(t))
			return 1;
		else
			return countLeaves(t.getRight()) + countLeaves(t.getLeft());
	}
		
	private static boolean isLeaf(TreeNode t)
	{
		if(t.getRight()==null && t.getLeft()==null)
			return true;
		return false;
	}
}

public class BinaryTreeQuiz4BKEY
{
   public static void main( String args[] )
   {
   	out.println("Quest 1");
		TreeNode x = new TreeNode(8,
					new TreeNode(66, null,null),
					new TreeNode(17, null,null));
		
		
		out.println(x.getValue());
		out.println(x.getLeft().getValue());
		out.println(x.getRight().getValue());

		


   	out.println("\n\nQuest 2");
		TreeNode y = new TreeNode("goat",
			new TreeNode("11", 
		            new TreeNode("pig", null,null),
		            new TreeNode("764", null,null)),
			new TreeNode("FROG", null,null));
			
				
		out.println(y.getValue());
		out.println(y.getLeft().getValue());
		out.println(y.getRight().getValue());
		out.println(y.getLeft().getRight().getValue());
		out.println(y.getRight().getLeft());	
	




   	out.println("\n\nQuest 3");		
		out.println("\n\n"+TreeFunHouse.countLeaves(x));		
		
				
   }
}