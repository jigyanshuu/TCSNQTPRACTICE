import java.lang.*;
import java.util.*;
public class SIEVEPRIME
{
        static List<Integer> simpleSieve(int limit)
        {
                boolean[] mark=new boolean[limit+1];
                Arrays.fill(mark, true);
                List<Integer>primes=new ArrayList<>();
                for(int p=2;p<=limit;p++){
                        if(mark[p]){
                                primes.add(p);
                                for(int i=p*p;i<=limit;i+=p){
                                        mark[i]=false;
                                }
                        }
                }
                return primes;
        }
        static void segmentedSieve(int m, int n){
                int limit=(int)Math.sqrt(n)+1;
                List<Integer>primes=simpleSieve(limit);
                boolean[] mark=new boolean[n-m+1];
                Arrays.fill(mark, true);
                for(int p:primes){
                        int start=Math.max(p*p,((m+p-1)/p)*p);
                        for(int j=start;j<=n;j+=p){
                                mark[j-m]=false;
                        }
                }
                for(int i=0;i<=n-m;i++){
                        if(mark[i] && (i+m)>1){
                                System.out.println(i+m);
                        }
                }
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        int n=sc.nextInt();
                        int m=sc.nextInt();
                        segmentedSieve(m, n);
                        System.out.println();
                }
        }
}