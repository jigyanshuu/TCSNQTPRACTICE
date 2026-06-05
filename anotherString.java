import java.util.Scanner;

public class anotherString
{
        public static String solve(String s){
                StringBuilder sb=new StringBuilder();
                boolean flag=false;
                for(int i=0;i<s.length();i++){
                        char ch=s.charAt(i);
                        if(ch>='0' && ch<='9'){
                                sb.append(ch);
                                if(ch=='9'){
                                        flag=true;
                                }
                        }
                        else{
                                if(sb.length()>0){
                                        if(!flag){
                                                return sb.toString();
                                        }
                                        sb.setLength(0);
                                        flag=false;
                                }
                        }
                }
                if(sb.length()>0 && !flag){
                        return sb.toString();
                }
                return "No valid number";
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                sc.nextLine();
                while(t-->0)
                {
                        String s=sc.nextLine();
                        System.out.println(solve(s));
                }
        }
}