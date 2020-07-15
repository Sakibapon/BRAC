public class Tree{
    Node root;
    
    Tree (){
        root= null;
    }
    
    public void insert (int val){
        if (root == null){
            root= new Node (val);
        }
        else{
            
    
    public int height (Node n){
        if (n== null) return -1;
        return 1 + max( height(n.left), height(n.right));
    }
    
    public int level (Node n){
        if (n == null) return 0;
        return 1+ level(n.parent);
    }
    
    public void preOrder(Node n){
        if (n == null) return;
        else {
            System.out.print( n.element+" ");
            preOrder( n.left);
            preOrder( n.right);
        }
    }
    
    public void inOrder (Node n){
        if (n == null) return;
        else {
            inOrder (n.left);
            System.out.print( n.element+" ");
            inOrder( n.right);
        }
    }
    
    public void postOrder( Node n){
        if (n == null) return;
        else {
            postOrder( n.left);
            postOrder( n.right);
            System.out.print( n.element+" ");
        }
    }
    
    public boolean same (Node n1, Node n2){
        if (n1 == null || n2 == null){
            if (n1 == n2) return true;
            else return false;
        }
        else {
            if (n1.element == n2.element){
                return same(n1.left, n2.left) && same(n1.right, n2.right);
            }
            else {
                return false;
            }
        }
    }
    
    public Node copyTree( Node n){
        if (n == null) return null;
        else {
            Node copy= new Node ( n.element, copy(n.left), copy(n.right));
            return copy;
        }
    }
}
            
        