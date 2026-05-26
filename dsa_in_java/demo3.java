
import java.util.Scanner;

public class demo3 {
        public static void main(String[] args) {
                int a,b,c;
                Scanner sc=new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                if(a!=b & b!=c & c!=a)
                {
                        if (a>b){
                                if (a>c){
                                        System.out.println("a is greater");
                                }
                                else{
                                        System.out.println("c is greater");
                                }
                        }
                        else if (b>c){
                                System.out.println("b is greater");
                        }
                        else{
                                System.out.println("c is greater");
                        }
                }
                else{
                        System.out.println("all are equal");
                }
}
}
