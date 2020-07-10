import java.util.*;


class Test{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        QuadEqn obj = new QuadEqn(x,y,z);
        
        obj.calculateRoot();
        System.out.println(obj.equationPrint());
    }
}