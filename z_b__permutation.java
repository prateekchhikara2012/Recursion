public class z_b__permutation {
    public static void main(String[] args) {
        
        String str="abc";
        fun(str,"");
    }
    public static void fun(String ques, String ans)
    {

        //bc

        if(ques.length()==0)
        {
            System.out.println(ans);
            return; 
        }

        for(int i=0;i<ques.length();i++)
        {
            char x=ques.charAt(i);
            String s=ques.substring(0,i);
            String s_2=ques.substring(i+1);
            s=s+s_2;

            fun(s,ans+x);
        }
    }
    
}
