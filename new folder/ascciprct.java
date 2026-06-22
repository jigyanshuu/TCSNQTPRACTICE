import java.util.*;
public class ascciprct {
        public static String solve1(String s){
                int shift;
                if(s.contains(" ")) return "Error";
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<s.length();i++){
                        char ch=s.charAt(i);
                        if(i%2==0){
                                shift=2;
                        }
                        else{
                                shift=1;
                        }
                        sb.append((char)(c+shift));
                }
                return sb.toString();
        }
        public static String solve(String s){
                StringBuilder sb=new StringBuilder();
                if(s.contains(" ")){
                        return "Error";
                }
                for(int i=0;i<s.length();i++){
                        char c=s.charAt(i);
                        int shift;
                        if(i%2==0){
                                shift=2;
                        }
                        else{
                                shift=1;
                        }
                        if(Character.isUpperCase(c)){
                                int position=(c-'A' + shift +26)%26;
                                sb.append((char)('A'+position));
                        }
                        else if(Character.isLowerCase(c)){
                                int position=(c-'a'+shift+26)%26;
                                sb.append((char)('a'+position));
                        }
                        else if(Character.isDigit(c)){
                                int position=(c-'0'+shift+10)%10;
                                sb.append((char)('0'+position));
                        }
                        else{
                                sb.append((char)(c+shift));
                        }
                }
                return sb.toString();
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String s=sc.next();
                System.out.println(solve(s));
                System.out.println(solve1(s));
        }
}
