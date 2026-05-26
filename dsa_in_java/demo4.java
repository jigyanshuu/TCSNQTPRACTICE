
import java.util.*;

public class demo4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int div = 2;
        boolean isprime = true;
        if (n <= 1) {
            isprime = false;
        }
        while (div < n) {
            if (n % div == 0) {
                isprime = false;
                break;
            } else {
                div += 1;
            }
        }
        if (isprime){
                System.out.println("prime");
        }
        else{
                System.out.println("not prime");
        }

    }
}
