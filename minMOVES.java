<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minMOVES {
        public static int solve(int n, String a, String b){
                for(int i=0;i<n;i++){
                        if(a.charAt(i)<b.charAt(i)){
                                return -1;
                        }
                }
                int moves=0;
                for(char c='a';c<='z';c++){
                        List<Integer> indices=new ArrayList<>();
                        for(int i=0;i<n;i++){
                                if(b.charAt(i)==c && a.charAt(i)!=b.charAt(i)){
                                        indices.add(i);
                                }
                        }
                        if(!indices.isEmpty()){
                                char small='z';
                                for(int i:indices){
                                        if(a.charAt(i)<small){
                                                small=a.charAt(i);
                                        }
                                }
                                if(small<c){
                                        return -1;
                                }
                                moves++;
                        }
                }
                return moves;
        }
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                int n=sc.nextInt();
                String a=sc.next();
                String b=sc.next();
                sc.close();
                System.out.println(solve(n, a, b));
        }
        
}
/* 
   import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class minMOVES {
    public static int solve(int n, String a, String b) {
        // Check if transformation is possible (A must be >= B at every index)
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                return -1; // Cannot increase a character
            }
        }

        int moves = 0;
        // Process characters from 'z' down to 'a'
        for (char c = 'z'; c >= 'a'; c--) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                // If we need to change a character in A to the target char 'c'
                if (a.charAt(i) != b.charAt(i) && b.charAt(i) == c) {
                    found = true;
                    break;
                }
            }
            if (found) {
                moves++;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        sc.nextLine(); // CRITICAL FIX: Consume the leftover newline

        String a = sc.nextLine();
        String b = sc.nextLine();
        
        sc.close();
        System.out.println(solve(n, a, b));
    }
}                       
=======
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minMOVES {
        public static int solve(int n, String a, String b){
                for(int i=0;i<n;i++){
                        if(a.charAt(i)<b.charAt(i)){
                                return -1;
                        }
                }
                int moves=0;
                for(char c='a';c<='z';c++){
                        List<Integer> indices=new ArrayList<>();
                        for(int i=0;i<n;i++){
                                if(b.charAt(i)==c && a.charAt(i)!=b.charAt(i)){
                                        indices.add(i);
                                }
                        }
                        if(!indices.isEmpty()){
                                char small='z';
                                for(int i:indices){
                                        if(a.charAt(i)<small){
                                                small=a.charAt(i);
                                        }
                                }
                                if(small<c){
                                        return -1;
                                }
                                moves++;
                        }
                }
                return moves;
        }
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                int n=sc.nextInt();
                String a=sc.next();
                String b=sc.next();
                sc.close();
                System.out.println(solve(n, a, b));
        }
        
}
/* 
   import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class minMOVES {
    public static int solve(int n, String a, String b) {
        // Check if transformation is possible (A must be >= B at every index)
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                return -1; // Cannot increase a character
            }
        }

        int moves = 0;
        // Process characters from 'z' down to 'a'
        for (char c = 'z'; c >= 'a'; c--) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                // If we need to change a character in A to the target char 'c'
                if (a.charAt(i) != b.charAt(i) && b.charAt(i) == c) {
                    found = true;
                    break;
                }
            }
            if (found) {
                moves++;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        sc.nextLine(); // CRITICAL FIX: Consume the leftover newline

        String a = sc.nextLine();
        String b = sc.nextLine();
        
        sc.close();
        System.out.println(solve(n, a, b));
    }
}                       
>>>>>>> 414a08cfa07b516845de4623b95b25a98b1d372e
*/