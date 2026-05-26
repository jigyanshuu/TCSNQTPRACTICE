

public class MaxiMiniArrayProblems 
{
        //max and min element of an arrayu
        public static int[] findMaxMin(int[] arr)
        {
                int max=arr[0];
                int min=arr[0];
                for(int i=1;i<arr.length;i++)
                {
                        if(arr[i] > max) max=arr[i];
                        if(arr[i] < min) min=arr[i];
                }
                return new int[]{max, min};
        }
        // kth larggest element of an array using selection sort logic
        public static int KthLargest(int[] arr, int k)
        {
                for(int i=0;i<k;i++)
                {
                        int maxindex=i;
                        for(int j=i+1;j<arr.length;j++)
                        {
                                if(arr[j]>arr[maxindex])
                                {
                                        maxindex=j;
                                }
                        }
                        int temp=arr[i];
                        arr[i]=arr[maxindex];
                        arr[maxindex]=temp;
                }
                return arr[k-1];
        }
        // find the peak element means element greater than or equal to neighbout
        public static int findPeak(int[] arr)
        {
                int n=arr.length;
                if(n==1) return arr[0];
                if(arr[0] >= arr[1]) return arr[0];
                if(arr[n-1]>=arr[n-2]) return arr[n-1];
                for(int i=1;i<n-1;i++)
                {
                        if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
                        {
                                return arr[i];
                        }
                }
                return -1; // no peak found shouldnt happen if at all array has a valid peak
        }
        //4. find the 3rd largest element of the array
        public static int thirdLargest(int[] arr)
        {
                int first=Integer.MIN_VALUE;
                int second=Integer.MIN_VALUE;
                int third=Integer.MIN_VALUE;
                for(int num : arr)
                {
                        if(num>first)
                        {
                                third=second;
                                second=first;
                                first=num;
                        }
                        else if(num>second && num !=first)
                        {
                                third=second;
                                second=num;
                        }
                        else if(num> third && num != second && num != first)
                        {
                                third= num;
                        }
                }
                return third;
        }
        public static void main(String[] args) {
                int[] arr={10,4,7,20,15,3};
                int[] maxMin=findMaxMin(arr);
                System.out.println(maxMin[0] + " " + maxMin[1]);
                int k=2;
                System.out.println(KthLargest(arr, k));
                System.out.println(findPeak(arr));
                System.out.println(thirdLargest(arr));
        }

}
