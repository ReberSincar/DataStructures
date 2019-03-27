package trees;
public class Tree
{
    private static TreeNode root;
    public Tree()
    {
	root=null;
    }

    public TreeNode getRoot()
    {
	return root;
    }
	
    public static void insert(int data)
    {
	TreeNode add = new TreeNode();
	add.data=data;
		
	if(root==null)
            root=add;
	else
	{
            TreeNode temp = root;
	
            while(true)
            {
                if(temp.data>add.data)
		{
                    if(temp.left != null)
                    {
			temp.parent=temp;
			temp=temp.left;
                    }
		
                    else
                    {
			temp.left=add;
			return;
                    }
		}
		else
		{
                    if(temp.right != null)
                    {
			temp.parent=temp;
			temp=temp.right;
                    }
                    else
                    {
			temp.right=add;
			return;
                    }
		}
            }   
        }
    }

    public void PreOrder(TreeNode root)
    {
        if(root==null) return;
	System.out.print(root.data+" ");
	PreOrder(root.left);
	PreOrder(root.right);
    }
    
    public void PostOrder(TreeNode root)
    {
        if(root==null) return;
	PreOrder(root.left);
	PreOrder(root.right);
        System.out.print(root.data+" ");
    }
    
    public void inOrder(TreeNode root)
    {
        if(root==null) return;
	PreOrder(root.left);
        System.out.print(root.data+" ");
	PreOrder(root.right);
    }

    public TreeNode Search(int data)
    {
	if(root == null)
            return null;
	else if(data==root.data)
            return root;
	else
	{
            TreeNode temp = root;
            while(true)
            {
		if(temp.data==data)
                    return temp;
		else if(temp.data<data)
		{
                    if(temp.right != null)
                        temp=temp.right;
                    else
                    {
			System.out.println("Bulunamadi");
			return null;
                    }
		}
		else
		{
                    if(temp.left != null)
			temp=temp.left;
                    else
                    {
			System.out.println("Bulunamadi");
			return null;
                    }
		}
            }
	}
    }

    public TreeNode Max()
    {
        TreeNode temp = root;
	if(root==null)
            return null;
	else
	{
            while(temp.right != null)
            temp=temp.right;
            return temp;
	}
    }

    public TreeNode Min()
    {
        TreeNode temp = root;
	
	if(root==null)
            return null;
	else
	{
            while(temp.left != null)
            temp=temp.left;
            return temp;
	}
    }

    public TreeNode insertrecursive(TreeNode tree , int data)
    {
        if(tree==null)
        {
            tree.left=null;
            tree.right=null;
            tree.data=data;
            return tree;
        }
        if(tree.data<data)
        {
            tree.right=add(tree.right,data);
            return tree;
        }
            
        tree.left=add(tree.left,data);
        return tree;
    }
        
    public int SearchRecursive(TreeNode tree, int data)
    {
        if(tree==null)
        {
            System.out.println("Bulunamadi");
            return -1;
        }
        if(tree.data == data)
        {
            System.out.println("Bulundu");
            return 1;
        }
        if(SearchRecursive(tree.left,data)==1)
        {
            System.out.println("Bulundu");
            return 1;
        }
        if(SearchRecursive(tree.right,data))
        {
            System.out.println("Bulundu");
            return 1;
        }
        System.out.println("Bulunamadi");
        return -1;
    }

    public TreeNode DeleteRecusive(TreeNode tree, int data)
    {
        if(tree == null)
            return null;
        if(tree.data==data)
        {
            if(tree.right==null && tree.left==null)
                return null;
            if(tree.left != null)
            {
                tree.data=max(tree.left);
                tree.left=DeleteRecursive(tree.left,max(tree.left));             
                return tree;
            }
            tree.data=min(tree.right);
            tree.right=DeleteRecursive(tree.right,min(tree.right));
            return tree;
        }
        if(tree.data<data)
        {
            tree.right = DeleteRecursive(tree.right,data);
            return tree;
        }
        tree.left=DeleteRecursive(tree.left,data);
        return tree;
    }
}
