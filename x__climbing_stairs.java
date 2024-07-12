public class x__climbing_stairs {
static int count=0;
    public static void main(String[] args) {


        fun(0,"");

        System.out.println(count);
    }
    
    public static void fun(int sum,String ans) {


        //-ve
        if(sum>5)
        {
            return ;
        }

        //+ve
        if(sum==5 )
        {
            System.out.println(ans);
            count++;
            return ;
        }


        for(int i=1;i<=3;i++)
        {
            fun(sum+i,ans+i);
        }

        // fun(sum+1,ans+"1");
        // fun(sum+2,ans+"2");
        // fun(sum+3,ans+"3");



    }
    
}
