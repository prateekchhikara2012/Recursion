public class z_f__jumping_nos {
    // print all the nos such that the differnce between them is 1 till 105
    public static void main(String[] args) {
        jumpingNos(1005,0); 
    }
    public static void jumpingNos(int limit , int ans)
    {

        if(ans>limit)
        {
            return ;
        }
        System.out.print(ans+" ");

        if(ans==0)
        {
            for(int i=1;i<=9;i++)
            {
                jumpingNos(limit, i);
            }
        }
        else{

            int x=ans%10;
            if(x==0)
            {
                jumpingNos(limit, ans*10+(x+1));
            }
            else if(x==9)
            {
                jumpingNos(limit, ans*10+(x-1));
            }
            else
            {
                jumpingNos(limit,ans*10+(x-1) );
                jumpingNos(limit, ans*10+(x+1));
            }
        }
    }
    
}
