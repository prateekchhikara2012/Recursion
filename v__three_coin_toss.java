public class v__three_coin_toss {
    public static void main(String[] args) {
        int num=3;
        fun(num," ");
    }
    public static void fun(int ques,String ans) {
        
        if(ques==0)
        {
            System.out.print(ans+" ");
            return;
        }


        fun(ques-1,ans+"h");
        fun(ques-1,ans+"t");
    }

    
}
