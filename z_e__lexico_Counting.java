public class z_e__lexico_Counting {
    public static void main(String[] args) {

        fun(0,1000);
        
    }
    public static void fun(int curr ,int num) {
        

        if(curr>num)
        {
            return ;

        }
        System.out.println(curr);



        int i=0;
        if(curr==0)
        i=1;

        while(i<=9)
        {
            fun(curr*10+i,num);
            i++;
        }



    }
}