import java.util.*;
public class longestcommonprefix {
        public static String solve(String[] arr)
        {
                StringBuilder sb=new StringBuilder();
                Arrays.sort(arr);
                char[] start=arr[0].toCharArray();
                char[] end=arr[arr.length-1].toCharArray();
                for(int i=0;i<start.length;i++)
                {
                        if(start[i]!=end[i])
                        {
                                break;
                        }
                        sb.append(start[i]);    
                }
                return sb.toString();
        }
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                String[] arr=new String[n];
                for(int i=0;i<n;i++){
                        arr[i]=scanner.next();
                }
                System.out.println(solve(arr));
        }
}
