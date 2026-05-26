import java.util.*;
public class reverseStringAllPrograms
{
        // reverse a string no builtin reverse
        public static String reverseString(String s)
        {
               char[] arr=s.toCharArray();
               int left=0;
               int right=arr.length-1;
               while(left<right)
                {
                        char temp=arr[left];
                        arr[left]=arr[right];
                        arr[right]=temp;
                        left++;
                        right--;
                }
                return new String(arr); 
        }
        // 2. reverse words in a sentence
        public static String reverseWords(String sentence)
        {
                char[] arr=sentence.toCharArray();
                int n=arr.length;
                int start=0;
                for(int i=0;i<=n;i++)
                {
                        if(i==n || arr[i] == ' ')
                        {
                                int end=i-1;
                                while(start<end)
                                {
                                        char temp=arr[start];
                                        arr[start]=arr[end];
                                        arr[end]=temp;
                                        start++;
                                        end--;
                                }
                                start=i+1;
                        }
                }
                return new String(arr);
        }
        // 3. check if a string is a pallindrome
        public static boolean isPallindrome(String s)
        {
                int left=0;
                int right=s.length()-1;
                while(left<right)
                {
                        if(s.charAt(left) !=s.charAt(right))
                        {
                                return false;
                        }
                        left++;
                        right--;
                }
                return true;
        }
        // 4 reverse only vowels in a string
        public static String reverseVowels(String s)
        {
                char[] arr=s.toCharArray();
                int left=0;
                int right=arr.length-1;
                while(left<right)
                {
                        while(left< right && !isVowel(arr[left])) left++;
                        while(left< right && !isVowel(arr[right])) right--;
                        char temp=arr[left];
                        arr[left]=arr[right];
                        arr[right]=temp;
                        left++;
                        right--;
                }
                return new String(arr);
        }
        // helper function for reverse vowel function
        private static boolean isVowel(char c)
        {
                return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c == 'E' || c=='I' || c=='O' || c=='U';
        }
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                String s1="hello";
                System.out.println(reverseString(s1));
                String s2="hellw world javaaa re java!!!";
                System.out.println(reverseWords(s2));
                String s3="1234554321";
                System.out.println(isPallindrome(s3));
                String s4="elepahtnisintherignththatwecantdoanythingabout";
                System.out.println(reverseVowels(s4));
                sc.close();
        }
}

