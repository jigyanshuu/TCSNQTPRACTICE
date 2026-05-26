import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Given equation is:");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

        double d = (b * b) - (4 * a * c);
        System.out.println("Discriminant (D) = " + d);

        if (d > 0) {
            System.out.println("Since D > 0, the equation has two distinct real roots.");

            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);

            System.out.println("Root x1 = " + x1);
            System.out.println("Root x2 = " + x2);
        }
        else if (d == 0) {
            System.out.println("Since D = 0, the equation has two equal real roots.");

            double x = -b / (2.0 * a);
            System.out.println("Root x1 = x2 = " + x);
        }
        else {
            System.out.println("Since D < 0, the equation has no real roots.");
        }

        sc.close();
    }
}
