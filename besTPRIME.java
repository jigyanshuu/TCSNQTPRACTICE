import java.util.*;
public class besTPRIME
{
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int LIMIT=1000000;
                boolean[] isPrime=new boolean[LIMIT+1];
                for(int i=2;i<=LIMIT;i++)
                {
                        isPrime[i]=true;
                }
                for(int i=2;i*i<=LIMIT;i++){
                        if(isPrime[i]){
                                for(int j=i*i;j<=LIMIT;j+=i){
                                        isPrime[j]=false;
                                }
                        }
                }
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                        long x=sc.nextLong();
                        if(x<4){
                                System.out.println("NO");
                                continue;
                        }
                        long root=(long) Math.sqrt(x);
                        if((root * root == x) && isPrime[(int) root]){
                                System.out.println("YES");
                        }
                        else{
                                System.out.println("NO");
                        }
                }
                sc.close();
        }
}