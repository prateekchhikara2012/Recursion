import java.util.Scanner;

public class k__Ruler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int tc=sc.nextInt();
        int inch=sc.nextInt();



        for(int i=1;i<=tc;i++)
        {
            System.out.print("- ");
        }
        System.out.println("0");


        for(int i=1;i<=inch;i++)
        {

            fun(tc-1);

            for(int j=1;j<=tc;j++)
            {
                System.out.print("- ");
            }
            System.out.println(i);

        }
    
        sc.close();
    }
    public static void fun(int tc)
    {

        if(tc==0)
        {
            return ;
        }

        fun(tc-1);
        for(int i=1;i<=tc;i++)
        {
            System.out.print("- ");
        }
        System.out.println();

        fun(tc-1);

    }
    
}
