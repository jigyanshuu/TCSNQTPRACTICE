
import java.util.Scanner;

public class swapCase
{
        public static void main(String[] args) {
               Scanner sc= new Scanner(System.in);
               String s=sc.nextLine();
               StringBuilder result =new StringBuilder();
               for(int i =0;i<s.length();i++)
               {
                char ch=s.charAt(i);
                if (ch>='A' && ch<='Z'){
                        result.append((char)(ch+32));
                }
                else if(ch>='a' && ch<='z'){
                        result.append((char)(ch-32));
                }
                else{
                        result.append(ch);
                }
               }
               System.out.println(result.toString());
        }
}