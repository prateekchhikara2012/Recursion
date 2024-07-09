public class t__subsequence_ascii {
    public static void main(String[] args) {
        String ques="ab";
        String ans="";
        fun(ques,ans);
    }
    public static void fun(String ques, String ans)
    {

        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }


        String str=ques.substring(1);
        char x=ques.charAt(0);
        int xyz=x;
        fun(str,ans);
        fun(str,ans+x);
        fun(str,ans+xyz);
    }
    
}
