import java.util.Scanner;
public class i__fibonacci_series {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        System.out.println(fun(num));

        sc.close();
    }

    public static int fun(int num)
    {

        if(num==0 || num==1)
        {
            return num;
        }

        int x=fun(num-1);
        int y=fun(num-2);

        return x+y;
    }

    
}
