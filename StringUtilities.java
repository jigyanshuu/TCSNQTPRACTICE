public class StringUtilities
{
        public static int[] countVowelandConsonants(String s)
        {
                int vowels=0;
                int consonants=0;
                for(int i=0;i<s.length();i++)
                {
                        char c=Character.toLowerCase(s.charAt(i));
                        if(c>='a' && c<='z'){
                                if(isvowel(c))
                                {
                                        vowels++;
                                }
                                else{
                                        consonants++;
                                }
                        }
                }
                return new int[]{vowels, consonants};
        }
        private static boolean isvowel(char c){
                return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
        }
        // find most frequent character
        public static char mostfrequnt(String s)
        {
                int[] freq=new int[256];
                for(int i=0;i<s.length();i++)
                {
                        freq[s.charAt(i)]++;
                }
                int maxfreq=0;
                char res=' ';
                for(int i=0;i<256;i++)
                {
                        if(freq[i]>maxfreq)
                        {
                                maxfreq=freq[i];
                                res=(char) i;
                        }
                }
                return res;
        }
        // check if 2 strings are anargram
        public static boolean areAnagrams(String s1, String s2)
        {
                if(s1.length() != s2.length())
                {
                        return false;
                }
                int[] freq=new int[256];
                for(int i=0;i<s1.length();i++){
                        freq[s1.charAt(i)]++;
                        freq[s2.charAt(i)]--;
                }
                for(int i=0;i<256;i++)
                {
                        if(freq[i] != 0)
                        {
                                return false;
                        }
                }
                return true;
        }
        public static void main(String[] args) {
                String s="hellloooowwww worlddddoaaaabffeeeioo";
                int[] counts=countVowelandConsonants(s);
                System.out.println(counts[0] + " " + counts[1]);
                System.out.println(mostfrequnt(s));
                String a="silent";
                String b="listen";
                System.out.println(areAnagrams(a, b));
        }
}
