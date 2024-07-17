public class z_c__NO_2_consecutive_heads {
    public static void main(String[] args) {
        int num=3;
        fun(num,"",false);// for both heads and tails will print no 2 consecutive heads
       // fun(num, "", true);// for tails branch ,it will print not print 2 consecutive heads


    }
    public static void fun(int num, String ans,boolean flag) {


        if(num==0)
        {
            System.out.println(ans);
            return ;
        }


        if(flag==true)
        {
            fun(num-1 , ans+"T",false);
        }
        else
        {
            fun(num-1 ,ans+"H",true);
            fun(num-1 , ans+"T",false);
        }
        
    }
    
}
