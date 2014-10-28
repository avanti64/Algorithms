package test.internship;

public class Trees_leet {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null && q==null){
    		return true;
    	}
    	else if(p==null || q==null){
    		return false;
    	}
    	
    	boolean isLeft = isSameTree(p.left, q.left);
    	boolean isRight = isSameTree(p.right, q.right);
        return p.val==q.val && isLeft && isRight;
       }
    
    public static void main(String args[]){
    	TreeNode q = new TreeNode(5);
    	q.left = new TreeNode(2); 
    	q.right = new TreeNode(6);
    	
    	TreeNode p = new TreeNode(5);
    	p.left = new TreeNode(6); 
    	p.right = new TreeNode(2);
    	
    	System.out.println(isSameTree(p,q));
    }
}

