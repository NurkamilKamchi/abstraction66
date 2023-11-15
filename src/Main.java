import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fourburch fourburch = new Fourburch(4,5);
        Triangle triangle = new Triangle(5,4);
        triangle.setB(5);
        Pentagon pentagon = new Pentagon();
        pentagon.setAllside(4);
        Trapezoid trapezoid = new Trapezoid(6,2,5);


        System.out.print(fourburch+" Preimetr: ");fourburch.getPerimetr();
        System.out.println("-----------------------------------------------");
        System.out.print(triangle+" perimetr: ");triangle.getPerimetr();
        System.out.println("-----------------------------------------------");
        System.out.print(pentagon+" perimetr: ");pentagon.getPerimetr();
        System.out.println("-----------------------------------------------");
        System.out.print(trapezoid+" perimetr: ");trapezoid.getPerimetr();
        System.out.println("-----------------------------------------------");
    }
}