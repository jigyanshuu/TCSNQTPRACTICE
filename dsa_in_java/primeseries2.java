
import java.util.Scanner;

public class primeseries2 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                if(n<=0){
                        System.out.println("not positive!");
                        scanner.close();
                        return;
                }     
                int count=0;
                int num=2;
                while (count<n){
                        if (isprime(num)){
                                System.out.println(num+" ");
                                count++;
                        }
                        num+=1;
                }
                System.out.println();
                scanner.close();
        }
        private static boolean isprime(int x){
                if (x<2) return false;
                if (x==2) return true;
                if (x%2==0) return false;
                int limit = (int) Math.sqrt(x);
                for (int d=3;d<=limit;d+=2){
                        if(x%d==0)return false;
                }
                return true;
        }
}
