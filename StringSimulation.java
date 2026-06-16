import java.util.*;
public class StringSimulation {
        public static String solve(String s)
        {
                StringBuilder sb=new StringBuilder();
                for(char ch:s.toCharArray()){
                        if(ch=='*'){
                                if(sb.length()>0){
                                        sb.deleteCharAt(sb.length()-1);
                                }
                        }
                        else if(ch=='#'){
                                sb.append(sb);
                        }
                        else if(ch=='%'){
                                sb.reverse();
                        }
                        else{
                                sb.append(ch);
                        }
                }
                return sb.toString();
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String s=sc.next();
                System.out.println(solve(s));
        }
}
