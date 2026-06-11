
import java.util.*;

public class new2pointer{
        public static int solve3(int[] arr, int k){
                HashMap<Integer, Integer> map=new HashMap<>();
                for(int num : arr){
                        map.put(num, map.getOrDefault(num, 0)+1);
                }
                int count=0;
                k=Math.abs(k);
                for(int num : map.keySet()){
                        if(k==0){
                                if(map.get(num)>1){
                                        count++;
                                }
                        }
                        else{
                                if(map.containsKey(num+k)){
                                        count++;
                                }
                        }
                }
                return count;
        }
        public static int solve2(int[] arr, int k){
                int count=0;
                k=Math.abs(k);
                for(int i=0;i<arr.length;i++){
                        for(int j=i+1;j<arr.length;j++){
                                if(Math.abs(arr[j]-arr[i])==k){
                                        count++;
                                }
                        }
                }
                return count;
        }
        public static int solve(int[] arr, int k){
                int count=0;
                int i=0;
                int j=1;
                k=Math.abs(k);
                while(j<arr.length)
                {
                        if(i==j){
                                j++;
                                continue;
                        }
                        int diff=arr[j]-arr[i];
                        if(diff==k){
                                count++;
                                i++;
                                j++;
                        }
                        else if(diff<k){
                                j++;
                        }
                        else{
                                i++;
                        }
                }
                return count;
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int k=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                Arrays.sort(arr);
                for(int i=0;i<n;i++){
                        System.out.println(arr[i]);
                }
                System.out.println(solve(arr, k));
        }
}