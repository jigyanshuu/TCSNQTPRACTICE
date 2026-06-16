import java.util.*;
public class footballhashmap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String, Integer> freq=new HashMap<>();
        for(int i=0;i<(n*(n-1)/2);i++){
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            freq.putIfAbsent(a,0);
            freq.putIfAbsent(b,0);
            String[] arr=c.split("-");
            int s1=Integer.parseInt(arr[0]);
            int s2=Integer.parseInt(arr[1]);
            if(s1>s2){
                freq.put(a,freq.get(a)+3);
            }
            else if(s2>s1){
                freq.put(b,freq.get(b)+3);
            }
            else{
                freq.put(a,freq.get(a)+1);
                freq.put(b,freq.get(b)+1);
            }
        }
        String win="";
        int maxi=-1;
        for(Map.Entry<String, Integer> entry : freq.entrySet()){
            if(entry.getValue()>maxi){
                maxi=entry.getValue();
                win=entry.getKey();
            }
        }
        System.out.println(win);
        System.out.println(maxi);
    }
}