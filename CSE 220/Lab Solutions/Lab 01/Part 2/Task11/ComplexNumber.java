
public class ComplexNumber extends RealNumber{
    
    public static int f;
    public double ImaginaryPart;
    
    public ComplexNumber(){
        if(f==0){
        super.setRealValue(1);
        ImaginaryPart=1;
        }
        else{
            System.out.println("I'm in ComplexNumber class");
            super.ping();
        }
    }
   
    public ComplexNumber(double x,double y){
        super(x);
        ImaginaryPart=y;
    }
    
    public String toString() {
        f++;
        return "RealPart: "+getRealValue()+"\n"
            +"ImaginaryPart: "+ImaginaryPart;
        
    }
    
    public void check(){
        System.out.println("Checking ended");
    }
   }