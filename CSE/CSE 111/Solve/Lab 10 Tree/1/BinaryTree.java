class BinaryTree {
    
    static Node root, root1;
    
    BinaryTree() {
        
        root = null;
    }
    
    int height(Node node) {
        
        if(node == null)
            return 0;
        
        else{
            
            int leftTree = height(node.left);
            int rightTree = height(node.right);
            
            if(leftTree > rightTree)
                return (leftTree+1);
            else
                return (rightTree+1);
        }
    }
    
    
    int getLevelHelper(Node node, int data, int level) 
    {
        if (node == null)
            return 0;
        
        if (node.key == data)
            return level;
        
        int downlevel = getLevelHelper(node.left, data, level + 1);
        if (downlevel != 0)
            return downlevel;
        
        downlevel = getLevelHelper(node.right, data, level + 1);
        return downlevel;
    }
    
    
    int getLevel(Node node, int data) 
    {
        return getLevelHelper(node, data, 1);
    }
    
    static void printPostorder(Node node) {
        
        if(node == null) 
            return;
        
        printPostorder(node.left);
        
        printPostorder(node.right);
        
        System.out.print(node.key + " ");
    }
    
    static void printPreorder(Node node) {
        
        if(node == null)
            return;
        
        System.out.print(node.key + " ");
        
        printPreorder(node.left);
        
        printPreorder(node.right);
    }
    
    static void printInorder(Node node)
    {
        if (node == null)
            return;
        
        
        printInorder(node.left);
        
        
        System.out.print(node.key + " ");
        
        
        printInorder(node.right);
    }
    
    
    
    
    boolean sameTree(Node node1, Node node2) {
        
        if(node1 == null && node2 == null)
            return true;
        
        if(node1 != null && node2 != null)
            return (node1.key == node2.key && sameTree(node1.left, node2.left) && sameTree(node1.right, node2.right));
        
        return false;
    }
    
    Node copy(Node node) {
        
        if(node == null)
            return null;
        
        else {
            
            Node copy = new Node(node.key, copy(node.left), copy(node.right));
            
            return copy;
        }
    }
    public static void main(String args[]) {
        
        BinaryTree tree = new BinaryTree();
        
        /*First tree*/
        tree.root = new Node(1, null, null);
        tree.root.left = new Node(2, null, null);
        tree.root.right = new Node(3, null, null);
        tree.root.left.left = new Node(4,null, null);
        tree.root.left.right = new Node(5, null, null);
        
        /*Second tree*/
        tree.root1 = new Node(1, null, null);
        tree.root1.left = new Node(2, null, null);
        tree.root1.right = new Node(3, null, null);
        tree.root1.left.left = new Node(4, null, null);
        tree.root1.left.right = new Node(5,null, null);
        
        
        System.out.println("Height of the tree is : " + tree.height(root));
        
        
        System.out.println();
        for (int x = 1; x <= 5; x++) 
        {
            int level = tree.getLevel(tree.root, x);
            
            if (level != 0)
                
                System.out.println("Level of " + x + " is "
                                       + tree.getLevel(tree.root, x));
            else
                System.out.println(x + " is not present in tree");
        }
        
        System.out.println();
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder(root);
        System.out.println();
        
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(root);
        System.out.println();
        
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder(root);
        
        
        System.out.println("\n");
        if(tree.sameTree(root, root1))
            System.out.println("Both trees are same!!");
        else
            System.out.println("Trees are not same!!");
        
        Node node = tree.copy(tree.root);
        System.out.println("\nNew Tree or copy of the given tree : ");
        System.out.println();
        
        System.out.println("Preorder traversal of new binary tree is ");
        tree.printPreorder(root);
        System.out.println();
        
        System.out.println("\nInorder traversal of new binary tree is ");
        tree.printInorder(root);
        System.out.println();
        
        System.out.println("\nPostorder traversal of new binary tree is ");
        tree.printPostorder(root);
        
        System.out.println();
    }
}