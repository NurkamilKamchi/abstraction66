public class Trapezoid extends Shape{
    private  int h ;
    public Trapezoid(int length, int width,int h){
        super(length,width);
        this.h=h;
    }

    @Override
    public void getPerimetr() {
        double res =( (getLength()+getWidth())*h)/2;
        System.out.println( res);
    }
}
