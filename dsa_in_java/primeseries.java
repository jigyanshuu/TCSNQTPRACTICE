
import java.util.Scanner;

public class primeseries {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int count=0;
                int num=2;
                while (count<n){
                        boolean isprime=true;
                        int div=2;
                        while (div<num){
                                if (num%div==0){
                                        isprime=false;
                                        break;
                                }
                                div++;
                        }
                        if (isprime){
                                System.out.println(num+" ");
                                count++;
                        }
                        num++;
                }
        }
}
