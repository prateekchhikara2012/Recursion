public class c__print_incresing {
    public static void main(String[] args) {
        // print in increasing order from 1 to 5 using recursion


        int num=5;
        System.out.println("Start");
        PI(num);
        System.out.println("End");
    }
    public static void PI(int num)
    {
        if(num==0)
        return ;

        PI(num-1);
        System.out.println(num);
    }
    
}
