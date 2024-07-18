public class z_c__print_only_tails_branch
{
    public static void main(String[] args) {
        fun("", 3);
    }
    public static void fun(String ans,int num) {

        if(num==0)
        {
            System.out.println(ans);
            return;
        }


        if(num==3)
        {
            fun(ans+"T",num-1);
        }
        else
        {
            fun(ans+"H",num-1);
            fun(ans+"T",num-1);
        }
        
    }
}