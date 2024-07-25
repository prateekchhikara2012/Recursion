public class z_g__partiton_palindrome {
    public static void main(String[] args) {
        

        String str="nitin";
        fun(str, "");
    }
    public static void fun(String ques, String ans) {

    
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=ques.length();i++)
        {

            if(check(ques.substring(0, i)))
            fun(ques.substring(i),ans+ques.substring(0, i)+"|");
        }
        
    }
    public static boolean check(String ans) {


        int i=0 , j=ans.length()-1;

        while(i<j)
        {
            if(ans.charAt(i)==ans.charAt(j));
            else
            {
                return false ;
            }
            i++;
            j--;
        }
        
        return true;
    }
    
}
