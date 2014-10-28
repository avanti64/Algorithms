package test.internship;

public class SimilarTree_leet {



    static boolean isSymmetric(TreeNode root) {  

      if(root == null) return true;  
      return isSym(root.left, root.right);  
    }  
    static boolean isSym(TreeNode left, TreeNode right)  
    {  
      if(left == null)  
       return right == null;  
     if(right ==null){
    	 return left == null;
     }
      if(left.val != right.val)  
        return false;  
      if(!isSym(left.left, right.right))
        return false;  
     if(!isSym(left.right, right.left))  
       return false;  
	return true;  
   }
    public static void main(String args[]){
       	TreeNode q = new TreeNode(1);
    	q.left = new TreeNode(2); 
    	q.right = new TreeNode(2);
    	q.left.left = new TreeNode(3);
    	q.left.right = new TreeNode(4);
    	q.right.left = new TreeNode(4);

    	System.out.println(isSymmetric(q));
    }
}