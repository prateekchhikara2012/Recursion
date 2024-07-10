public class u__calculator_recrusion {

    public static void main(String[] args) {

        String ques="147";
        String ans="";
        fun(ques,ans);
        
    }
    public static String extraxt(char i) {
        if(i=='1')
        {
            return "abc";
        }
        if(i=='4')
        {
            return "jklm";
        }
        if(i=='7')
        {
            return "rst";
        }
        return null;
    }
    public static void fun(String ques,String ans) {

        if(ques.length()==0)
        {  
            System.out.println(ans);
            return;
        }

        String str=extraxt(ques.charAt(0));//abc
        ques=ques.substring(1);

        for(int i=0;i<str.length();i++)
        {
            fun(ques,ans+ str.charAt(i));
        }

        
    }

    
}
