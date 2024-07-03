import java.util.Scanner;

public class j__pattern_ruler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );

        int num=5;

        fun(num);
        sc.close();

    }
    public static void fun(int num)
    {

        if(num==0)
        {
            return ;
        }


        
        fun(num-1);

        for(int i=1;i<=num;i++)
        {
            System.out.print("- ");
        }
        System.out.println();

        fun(num-1);
    }
    
}
