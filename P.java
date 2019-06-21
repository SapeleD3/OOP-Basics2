import java.util.Scanner;
import java.lang.*;

public class P {

// Encapsulation

    public static void main (String [] args) {
        //instansiation
        Scanner read = new Scanner(System.in);
        P take = new P();

        double p;
        double F;
        double A;

        System.out.println("input value of F: ");
        F = take.getF();

        System.out.println("input value of A: ");
        A = read.nextDouble();

        p = F/A;
        System.out.println("P = " +p);

        return;
        
    }

    public double getF(){
        Scanner read = new Scanner(System.in);
        P take = new P();
        double F;
        double m;
        double r;
        double w;

        System.out.println("input value of m: ");
        m = read.nextDouble();

        System.out.println("input value of r: ");
        r = read.nextDouble();

        System.out.println("input value of w: ");
        //interface
        w = take.getW();

        F = m*r*Math.pow(w, 2);
        System.out.println("F = " +F);

        return F;

    }


//implementation
    double getW() {
        Scanner read = new Scanner(System.in);

        double w;
        double v;
        double r;

        System.out.println("input value of v: ");
        v = read.nextDouble();

        System.out.println("input value of r: ");
        r = read.nextDouble();

        w = v/r;
        System.out.println("w = " +w);

        return w;
    }
}