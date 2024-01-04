package Tasks;

public class StringPrac {
    public static void main(String[] args) {
        String s=new String("ReverseThis");
        int i;
        for (i=s.length();i>0;i--){
            System.out.print(s.charAt(i-1));
        }
        System.out.println();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}
