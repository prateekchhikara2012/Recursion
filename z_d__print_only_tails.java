public class z_d__print_only_tails {
    public static void main(String[] args) {

        fun("",false,3);
        
        
    }
    public static void fun(String ans,boolean flag ,int num) {

        if(flag==true)
        {
            return;
        }

        if(num==0)
        {
            System.out.println(ans);
            return;
        }


       fun(ans+"H",true , num-1);
       fun(ans+"T",false,num-1);
        
    }
}
