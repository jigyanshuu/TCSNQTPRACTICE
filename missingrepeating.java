import java.util.*;
public class missingrepeating
{
        public static ArrayList<Integer>solve(int[] arr)
        {
                int n=arr.length;
                int[] freq=new int[n+1];
                int repeating=-1;
                int missing=-1;
                for(int i=0;i<n;i++){
                        freq[arr[i]]++;
                }
                for(int i=1;i<=n;i++){
                        if(freq[i]==0){
                                missing=i;
                        }
                        else if(freq[i]==2){
                                repeating=i;
                        }
                }
                ArrayList<Integer> res=new ArrayList<>();
                res.add(repeating);
                res.add(missing);
                return res;
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++) arr[i]=sc.nextInt();
                ArrayList<Integer> ans=solve(arr);
                System.out.println(ans.get(0) + " " + ans.get(1));
        }
}