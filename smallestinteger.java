import java.util.*;
public class smallestinteger {
        public static int solve(int n){
                int product=1;
                while(n>0){
                        product=product*(n%10);
                        n=n/10;
                }
                return product;
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int b=10;
                while(true){
                        if(solve(b)==n){
                                System.out.println(b);
                                break;
                        }
                        if(b>100000000){
                                System.out.println(-1);
                                break;
                        }
                        b++;
                }
        }
}
