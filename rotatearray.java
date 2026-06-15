import java.util.*;
public class rotatearray{
        public static void rotation(int[] nums, int k){
                int n=nums.length;
                int[] res=new int[n];
                k=k%n;
                for(int i=0;i<n;i++){
                        res[(i+k)%n]=nums[i];
                }
                for(int i=0;i<n;i++){
                        nums[i]=res[i];
                }
                for(int i=0;i<n;i++){
                        System.out.print(nums[i]+" ");
                }
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                int k=sc.nextInt();
                rotation(arr, k);
                // k=k%n;
                // int[] res=new int[n];
                // for(int i=0;i<n;i++){
                //         res[(i+k)%n]=arr[i];
                // }
                // for(int x : res){
                //         System.out.print(x+" ");
                // }
        }
}