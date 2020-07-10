class QuadEqn{
    
    private int a;
    private int b;
    private int c;
    
    int root;
    
    public QuadEqn(int a1, int a2, int a3){
        this.a = a1;
        this.b = a2;
        this.c = a3;
    }
    
    public void calculateRoot(){
        System.out.println(root =(int) (-b + Math.sqrt((b*b)-4*a*c))/2*a);
        
    }
    
    String equationPrint(){
       return a+"x^2 + "+b+"x + "+c;
    }
   
}