
import java.util.Scanner;

public class demo2
{
        public static void main(String[] args) 
        {
                float p, r, t, si;
                Scanner scanner=new Scanner(System.in);
                p=scanner.nextFloat();
                r=scanner.nextFloat();
                t=scanner.nextFloat();
                si=(p*r*t)/100;
                System.out.println(si);
        }
}