public class Triangle extends Shape{
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Triangle(){

    }
    public Triangle(int length, int width){
        super(length,width);
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString();
    }

    @Override
    public void getPerimetr() {
        double res = getLength()+getWidth()+getB();
        System.out.println(res);
    }
}
