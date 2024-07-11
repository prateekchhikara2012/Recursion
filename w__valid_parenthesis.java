import java.util.ArrayList;

public class w__valid_parenthesis {



    static ArrayList < String> list=new ArrayList <> ();


    public static void main(String[] args) {
        

        String str="";
        fun(0,0,3,str);
        System.out.println(list);


    }
   
    public static void fun(int open ,int close ,int num ,String ans) {

        // -ve bc
        if(open>num || close>open)
        return ;

        
        // +ve bc
        if(open==num && close==num)
        {
            list.add(ans);
            return;
        }

        fun(open+1 , close, num , ans+"(" );
        fun(open ,close+1, num , ans+")");        

        
    }
    
}
