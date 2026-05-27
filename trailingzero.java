
import java.util.Scanner;

public class trailingzero {
        public static int solve(int n){
                int count=0;
                while(n>0)
                {
                        n=n/5;
                        count+=n;
                }
                return count;
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int x=solve(n);
                System.out.println(x);
        }
}
