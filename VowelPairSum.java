import java.util.*;
public class VowelPairSum
{
       static Map<Integer, String> numToWord = Map.ofEntries(
        Map.entry(0,"zero"), Map.entry(1,"one"), Map.entry(2,"two"),
        Map.entry(3,"three"), Map.entry(4,"four"), Map.entry(5,"five"),
        Map.entry(6,"six"), Map.entry(7,"seven"), Map.entry(8,"eight"),
        Map.entry(9,"nine"), Map.entry(10,"ten"), Map.entry(11,"eleven"),
        Map.entry(12,"twelve"), Map.entry(13,"thirteen"), Map.entry(14,"fourteen"),
        Map.entry(15,"fifteen"), Map.entry(16,"sixteen"), Map.entry(17,"seventeen"),
        Map.entry(18,"eighteen"), Map.entry(19,"nineteen"), Map.entry(20,"twenty"),
        Map.entry(30,"thirty"), Map.entry(40,"forty"), Map.entry(50,"fifty"),
        Map.entry(60,"sixty"), Map.entry(70,"seventy"), Map.entry(80,"eighty"),
        Map.entry(90,"ninety"), Map.entry(100,"hundred"), Map.entry(1000,"thousand")
    );
    public static String vowelpair(int[] nums){
        String vowels="aeiou";
        int total=0;
        for(int num :  nums){
                String word=numToWord.getOrDefault(num, String.valueOf(num));
                for(char c : word.toCharArray()){
                        if(vowels.indexOf(c)!=-1){
                                total+=1;
                        }
                }
        }
        if(total>100){
                return "hundred";
        }
        int paircount=0;
        for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                        if(nums[i] + nums[j] == total){
                                paircount++;
                        }
                }
        }
        return numToWord.getOrDefault(paircount, String.valueOf(paircount));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
        }
        System.out.println(vowelpair(nums));
    }
}