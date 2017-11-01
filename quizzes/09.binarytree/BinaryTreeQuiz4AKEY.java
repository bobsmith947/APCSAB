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

public class BinaryTreeQuiz4AKEY
{
   public static void main( String args[] )
   {
   	out.println("Quest 1");
		TreeNode x = new TreeNode(11,
					new TreeNode(88, null,null),
					new TreeNode(2, null,null));
		
		
		out.println(x.getValue());
		out.println(x.getLeft().getValue());
		out.println(x.getRight().getValue());



   	out.println("\n\nQuest 2");
		TreeNode y = new TreeNode("77",
			new TreeNode("ape", 
		            new TreeNode("run", null,null),
		            new TreeNode("99", null,null)),
			new TreeNode("PIG", null,null));
			
				
		out.println(y.getValue());
		out.println(y.getLeft().getValue());
		out.println(y.getRight().getValue());
		out.println(y.getLeft().getRight().getValue());
		out.println(y.getRight().getLeft());
	




   	out.println("\n\nQuest 3");		
		out.println("\n\n"+TreeFunHouse.countLeaves(x));		
		
				
   }
}