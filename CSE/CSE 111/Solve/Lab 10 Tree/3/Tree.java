public class Tree {
    public static void main(String[]args){
    Node n1=new Node(3);
    Node n2=new Node(4);
    Node n3=new Node(1);
    Node n4=new Node(10);
    Node n5=new Node(5);
    Node n6=new Node(2);
    Node n7=new Node(6);
    
    
    n1.left=n2;
    n1.right=n5;
    n2.left=n3;
    n2.right=n4;
    n5.right=n6;
    n6.right=n7;
    
    System.out.println("The Preorder is");
    preorder(n1);
    
            
    }

    
    public static void preorder(Node n){
    if(n == null){
    return;
    }
    else{
    System.out.println(n.data +" ");
    preorder(n.left);
    preorder(n.right);
   }
 }  
    public static void inorder(Node n){
     if(n==null)return;
     inorder(n.left);
     System.out.println(n.data+"");
     inorder(n.right);
    }
    public static void postorder(Node n){
     if(n==null)return;
     postorder(n.left);
     postorder(n.right);
     System.out.println(n.data +"");
        
     }
    public static int getLevel(Node node,int target,int level){
     if(node==null)
         return 0;
     if(node.data==target)
         return level;
     int downlevel=getLevel(node.left,target,level+1);
             if(downlevel!=0)
             return downlevel;
             else{
                 downlevel=getLevel(node.right,target,level+1);
                 return downlevel;
             
             }
   }
    
  }   

    
    
