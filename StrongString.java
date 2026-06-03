import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StrongString{
        public static boolean checkStrong(String s)
        {
                int[] freq=new int[26];
                for(int i=0;i<s.length();i++){
                        char ch=s.charAt(i);
                        int index=ch-'a';
                        freq[index]++;
                }
                for(int i=0;i<26;i++){
                        if(freq[i]>0){
                                int pos=i+1;
                                if(freq[i]!=pos){
                                        return false;
                                }
                        }
                }
                return true;
        }
        public static boolean checkStronganother(String s){
                Map<Character,Integer>freq=new HashMap<>();
                for(char ch:s.toCharArray()){
                        freq.put(ch, freq.getOrDefault(ch, 0)+1);
                }
                Map<Character, Integer>letterbook=new HashMap<>();
                for(int i=0;i<26;i++){
                        letterbook.put((char)('a' + i),i+1);
                }
                for(char ch:freq.keySet()){
                        if(!freq.get(ch).equals(letterbook.get(ch))){
                                return false;
                        }
                }
                return true;
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String s=sc.next();
                if(checkStronganother(s)){
                        System.out.println("Strong");
                }
                else{
                        System.out.println("weak");
                }
        }
}