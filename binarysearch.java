import java.util.Scanner;

public class binarysearch {
        public static int solve(int[] arr, int k)
        {
                int n=arr.length;
                int low=0;
                int high=n-1;
                int ans=-1;
                while(low<=high)
                {
                        int mid=low + (high-low) / 2;
                        if(arr[mid] == k)
                        {
                                ans=mid;
                                break;
                        }
                        else if(arr[mid] <k)
                        {
                                low=mid+1;
                        }
                        else{
                                high=mid-1;
                        }
                }
                return ans;
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[] arr=new int[n];
                int k=sc.nextInt();
                for(int i=0;i<n;i++)
                {
                        arr[i]=sc.nextInt();
                }
                System.out.println(solve(arr, k));
        }
}