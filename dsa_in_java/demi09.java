
import java.util.Scanner;

public class demi09 {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int total=0;
                int marks;
                System.out.println("enter of 25 students: ");
                for (int i=1; i<=25; i++){
                        System.out.println("Student "+i+":");
                        marks=sc.nextInt();
                        total=total+marks;
                }
                double average=total/25.0;
                System.out.println("total marks ="+total);
                System.out.println("average marks of the class= "+average);
                sc.close();

        }
}
