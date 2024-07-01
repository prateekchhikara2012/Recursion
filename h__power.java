import java.util.Scanner;

public class h__power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Hi");

        int num=sc.nextInt();
        int power=sc.nextInt();

        System.out.println(fun(num,power));
        sc.close();
        
    }
    public static int fun(int num,int power)
    {
        if(power==0)
        return 1;

        int x=fun(num,power-1);
        x=x*num;

        return x;
    }
    
}
