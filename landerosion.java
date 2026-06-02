import java.util.*;
public class landerosion{
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=1;i<=t;i++){
                        double x=sc.nextDouble();
                        double y=sc.nextDouble();
                        double area=Math.PI * (x*x+y*y)/2.0;
                        int year=(int)Math.ceil(area/50.0);
                        System.out.println(
                                "Property " + i +
                                ": This property will begin eroding in year " +
                                year + "."
                        );
                }
                System.out.println("END OF OUTPUT");
        }
}