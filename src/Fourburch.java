public class Fourburch extends Shape {
    public Fourburch() {

    }

    public Fourburch(int length, int width) {
        super(length, width);
    }

    @Override
    public void getPerimetr() {
        int res = (getLength()+getWidth())*2;
        System.out.println(res);
    }

    @Override
    public String toString() {

        return "Triangle: " + super.toString();
    }

}
