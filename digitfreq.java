import java.util.*;
public class digitfreq{
        public static int[] intArray(int n)
        {
                int temp=n;
                int count=0;
                while(temp>0){
                        count++;
                        temp/=10;
                }
                int[] res=new int[count];
                temp=n;
                for(int i=count-1;i>=0;i--){
                        res[i]=temp%10;
                        temp/=10;
                }
                return res;
        }
        public static int digitFreqscore(int n){
                if(n==0) return 0;
                int tempn=Math.abs(n);
                int[] convert=intArray(tempn);
                int sum=0;
                for(int i=0;i<convert.length;i++){
                        sum+=convert[i];
                }
                return sum;
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        int n=sc.nextInt();
                        System.out.println(digitFreqscore(n));
                }
                sc.close();
        }
}