import java.util.*;

public class newString {

    // Approach 1: Using Character.isUpperCase()
    public static String method1(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch) && i != 0) {
                ans.append(" ");
            }

            ans.append(Character.toLowerCase(ch));
        }

        return ans.toString();
    }

    // Approach 2: Using ASCII comparisons only
    public static String method2(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                if (i != 0) {
                    ans.append(" ");
                }
                ans.append((char)(ch + 32));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    // Approach 3: Similar to your friend's solution (ArrayList)
    public static String method3(String s) {

        ArrayList<Character> list = new ArrayList<>();

        char first = s.charAt(0);

        if (first >= 'A' && first <= 'Z')
            first = (char)(first + 32);

        list.add(first);

        for (int i = 1; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {

                list.add(' ');

                ch = (char)(ch + 32);
                list.add(ch);
            }
            else {
                list.add(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char c : list) {
            ans.append(c);
        }

        return ans.toString();
    }

    // Approach 4: Build words separately
    public static String method4(String s) {

        ArrayList<String> words = new ArrayList<>();

        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (i != 0 && ch >= 'A' && ch <= 'Z') {

                words.add(current.toString().toLowerCase());
                current = new StringBuilder();
            }

            current.append(ch);
        }

        words.add(current.toString().toLowerCase());

        return String.join(" ", words);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println("Method 1:");
        System.out.println(method1(s));

        System.out.println();

        System.out.println("Method 2:");
        System.out.println(method2(s));

        System.out.println();

        System.out.println("Method 3 (Friend's Style):");
        System.out.println(method3(s));

        System.out.println();

        System.out.println("Method 4:");
        System.out.println(method4(s));
    }
}