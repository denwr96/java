package javaguru.sunday.student_deniss_lobacs.lesson2;
import java.util.Scanner;

public class Task10 {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {

//        final Double PI=3.14;

        System.out.print("Enter radius: ");
        double r=scn.nextDouble();

        double p = 2*Math.PI*r;
        double s = Math.PI *(r*r);

        System.out.println("Perimeter is = " + p);
        System.out.println("Area is = " + s);

    }
}
