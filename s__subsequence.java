public class s__subsequence {
    public static void main(String[] args) {

        fun("abc","");
    }
    public static void fun(String ques ,String ans) {

        if(ques.length()==0)
        {
            System.out.println(ans);
            return ;
        }

        char x= ques.charAt(0);
        String str=ques.substring(1);

        fun(str,ans);
        fun(str,ans+x);
        
    }
    
}
