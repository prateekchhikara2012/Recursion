public class z_i__power_log_n {

    public static void main(String[] args) {
        
       System.out.println( recursion(2,10));
    }

    public static int recursion(int exp , int power)
    {
        if(power==1)
        return exp  ;


        int ans=recursion(exp, power/2);
        int sum=ans*ans;

        if(power%2!=0)
        {
            sum=sum*exp;
        }
        return sum ;
    }
    
}
