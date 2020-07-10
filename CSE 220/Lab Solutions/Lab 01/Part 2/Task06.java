class Task06{
    public static void main(String args[]){

        double h, w, a;

        Square s1 = new Square();

        s1.setHeight(3);
        s1.setWidth(4);

        h = s1.getHeight();
        w = s1.getWidth();
        a = s1.getArea();

        System.out.println("Height = "+ h);
        System.out.println("Width  = "+ w);
        System.out.println("Area   = "+ a);
    }
}

class Square{

    private double height;
    private double width;

    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getWidth (){
        return width;
    }
    public void setWidth (double w){
        width = w;
    }
    public double getArea (){
        return height*width;
    }
}
