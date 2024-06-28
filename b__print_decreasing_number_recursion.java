import java.util.Scanner;
public class b__print_decreasing_number_recursion {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");

        int num=sc.nextInt();

        fun(num);
        sc.close();
    }
    
    public static void fun(int num) 
    {
        if(num==0)
        return ;

        System.out.println(num);
        
        fun(num-1);
    }
    
}
