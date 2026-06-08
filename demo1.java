public class demo1{
        public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int[] newarr=new int[n];
        for(int i=0;i<n;i++){
          newarr[i]=arr[n-1-i];
        }
        for(int i=0;i<newarr.length;i++){
          System.out.println(newarr[i]);
          System.out.println(arr[i]);
        }
      }
}