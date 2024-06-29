import java.util.Scanner;

public class g__factorial_return_int {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Hii");
        int num=sc.nextInt();
        System.out.println("fact is "+ fun(num));
        System.out.println("Bye");
        sc.close();
    }

    public static int fun(int num)
    {

        if(num==0)
        {
            return 1;
        }
        int x=fun(num-1);

        int p=x*num;


        return p;
    }
    
}
