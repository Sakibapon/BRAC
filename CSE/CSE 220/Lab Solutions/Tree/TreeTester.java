public class TreeTester{
    public static void main(String []args){
        //Tree1
        //elem, left, right, parent
        Node n1= new Node(89, null, null, null);//root
        
        Node n5= new Node(53, null, null, null);
        Node n6= new Node(58, null, null, null);
        Node n7= new Node(3, null, null, null);
        
        Node n2= new Node(69, null, null, n1);
        Node n3= new Node(67, null, null, n1);
        
        Node n4= new Node(42, n7, null, n2);
        
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        
        n5.parent=n2;
        n6.parent=n3;
        n7.parent=n4;
        
        n1.left=n2;
        n1.right=n3;
        
        //Tree2 Binary 
        //elem, left, right, parent
        Node d1= new Node(92, null, null, null);//root
        
        Node d4= new Node(46, null, null, null);
        Node d5= new Node(26, null, null, null);
        Node d6= new Node(57, null, null, null);
        Node d7= new Node(59, null, null, null);
        
        Node d8= new Node(36, null, null, null);
        
        Node d2= new Node(78, d4, d5, d1);
        Node d3= new Node(71, d6, d7, d1);
        
        d1.left=d2;
        d1.right=d3;
        d4.left=d8;
        
        d4.parent=d2;
        d5.parent=d2;
        d6.parent=d3;
        d7.parent=d3;
        
        d8.parent=d4;
        
        Tree a = new Tree();
        System.out.println("____________Task1___________");
        System.out.println("Height "+a.height(n1));
        System.out.println("___________Task2____________");
        System.out.println("Level "+a.level(n1));
        System.out.println("Level "+a.level(n2));
        System.out.println("Level "+a.level(n6));
        System.out.println("Level "+a.level(n7));
        System.out.println("__________Task3,4,5_____________");
        System.out.println("Pre-order :");
        a.preOrderVisit(n1);
        System.out.println();
        System.out.println("In-order :");
        a.inOrderVisit(n1);
        System.out.println();
        System.out.println("Post-order :");
        a.posOrderVisit(n1);
        System.out.println();
        System.out.println("__________Task6_____________");
        Node newRoot=a.copy(n1);
        System.out.println("Pre-order Copied Tree:");
        a.preOrderVisit(newRoot);
        System.out.println();
        System.out.println("_______________________");
        System.out.println("Pre-order Actual Tree:");
        a.preOrderVisit(n1);
        System.out.println();
        System.out.println("__________Task7_____________");
        System.out.println("Pre-order Copied Tree:");
        a.preOrderVisit(newRoot);
        System.out.println();
        System.out.println("Pre-order Actual Tree:");
        a.preOrderVisit(n1);
        System.out.println();
        System.out.println("Check1 Same: "+a.same(n1, newRoot));
        
        
        System.out.println("_______________________");
        System.out.println("Pre-order Tree1:");
        a.preOrderVisit(n1);
        System.out.println();
        System.out.println("Pre-order Tree2:");
        a.preOrderVisit(d1);
        System.out.println();
        System.out.println("Check2 Same: "+a.same(n1, d1));
    }
}