import java.util.*;
public class sweetseventeen
{
        public static long usingascci(String str)
        {
                long res=0;
                int len=str.length();
                for(int i=0;i<len;i++)
                {
                        char c=str.charAt(i);
                        int val=Character.isDigit(c) ?  (c-'0') : (c-'A' + 10);
                        res+=val * Math.pow(17,len-1-i);
                }
                return res;
        }
        public static long usingMap(String str)
        {
                Map<Character, Integer>charMap=new HashMap<>();
                for(int i=0;i<=9;i++)
                {
                        charMap.put((char)(i+'0'),i);
                }
                charMap.put('A', 10);
                charMap.put('B', 11);
                charMap.put('C', 12);
                charMap.put('D', 13);
                charMap.put('E', 14);
                charMap.put('F', 15);
                charMap.put('G', 16);
                long res=0;
                int len=str.length();
                for(int i=0;i<len;i++)
                {
                        res+=charMap.get(str.charAt(i)) * Math.pow(17,len-1-i);
                }
                return res;
        }
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                String str=sc.next().toUpperCase();
                System.out.println("res using asccii: " + usingascci(str));
                System.out.println("res using mapping: " + usingMap(str));        
        }
}