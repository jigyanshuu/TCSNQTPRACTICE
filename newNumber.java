import java.util.*;
public class newNumber {
        public static int solve(int n)
        {
                String s=String.valueOf(n);
                int odd1=0;
                int even1=0;
                for(int i=0;i<s.length();i++)
                {
                        int digit=Character.getNumericValue(s.charAt(i));
                        if((i+1)%2!=0){
                                odd1+=digit;
                        }
                        else{
                                even1+=digit;
                        }
                }
                return Math.abs(odd1-even1);
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                System.out.println(solve(n));
        }
}
