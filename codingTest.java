import java.util.*;
public class codingTest {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int principal=sc.nextInt();
                int time=sc.nextInt();
                int n1=sc.nextInt();
                ArrayList<Float> list1 =new ArrayList<>();
                ArrayList<Float> list2=new ArrayList<>();
                for(int i=0;i<n1;i++){
                        float amount1=sc.nextFloat();
                        float interest1=sc.nextFloat();
                        list1.add(interest1);
                }
                int n2=sc.nextInt();
                for(int i=0;i<n2;i++){
                        float amount2=sc.nextFloat();
                        float interest2=sc.nextFloat();
                        list2.add(interest2);
                }
                float sum1=0;
                float sum2=0;
                for(int i=0;i<list1.size();i++){
                        sum1+=list1.get(i);
                }
                for(int i=0;i<list2.size();i++){
                        sum2+=list2.get(i);
                }
                if(sum1 < sum2){
                        System.out.println("BANK A");
                }
                else{
                        System.out.println("BANK B");
                }

        }
}
