import java.util.*;;
public class newcodeforces {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            String[] parts=s.split("\\+");
            int[] nums=new int[parts.length];
            for(int i=0;i<parts.length;i++){
                nums[i]=Integer.parseInt(parts[i]);
            }
            Arrays.sort(nums);
            StringBuilder res= new StringBuilder();
            for(int i=0;i<nums.length;i++){
                res.append(nums[i]);
                if(i<nums.length-1){
                        res.append("+");
                }
            }
            System.out.println(res.toString());
            sc.close();
        }
}
