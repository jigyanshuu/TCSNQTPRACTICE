import java.util.*;
public class codeforces2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        while(n<=m){
            n=n*3;
            m=m*2;
            count+=1;
        }
        System.out.println(count);
    }
}