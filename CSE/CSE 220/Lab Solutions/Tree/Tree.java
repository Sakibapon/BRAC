public class Tree{
  public int level(Node n) {
    if(n==null){
      return -1;
    }
    else{
      int l = level(n.parent);
      return ++l;
    }
  }
  public int height(Node n){ 
    if (n == null){
      return 0;
    }
    else { 
      int left_height = height(n.left);
      int right_height = height(n.right);
      
      if(left_height > right_height){
        return (++left_height);
      }
      else{
        return (++right_height);
      }
    }
  }
  
//pre-order traversal : visit self, then left and then right (slr)
//in-order traversal : visit left, then self, then right (lsr)
//post-order traversal : visit left, then right, and then self (lrs)
  
  public void preOrderVisit(Node n) {
    if(n==null){
      return;
    }
    else{
      visit(n);
      preOrderVisit(n.left);
      preOrderVisit(n.right);
    }
  }
  public void visit(Node n){
    System.out.print(n.item+" ");
  }
  
  public void inOrderVisit(Node n) {
    if(n==null){
      return;
    }
    else{
      inOrderVisit(n.left);
      visit(n);
      inOrderVisit(n.right);
    }
  }
  public void posOrderVisit(Node n) {
    if(n==null){
      return;
    }
    else{
      posOrderVisit(n.left);
      posOrderVisit(n.right);
      visit(n);
    }
  }
  
  
  public Node copy(Node n) {
    if(n!=null){
      Node s = new Node(n.item,n.left,n.right,null);
      return s;
    }
    return null;
  }
  
  public boolean same(Node n1, Node n2) {
    boolean isSame = true;
    if(n1==null && n2==null){
      return true;
    }
    else if((n1==null && n2!=null)||(n1!=null && n2==null)){
      return false;
    }
    else{
      isSame = same(n1.left, n2.left);
      if(isSame == false){
        return false;
      }   
      isSame = same(n1.right, n2.right);
      if(isSame == false){
        return false;
      }
    }
    return isSame;
  }
}