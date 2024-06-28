public class d__print_decreasing_increasing {
    public static void main(String[] args) {
        //print the decreasing and than increasing using recursion 
        // output---   num->1 1->n

        int num=4;
        System.out.println("Start");
        PDI(num);
        System.out.println("End");
    }
    public static void PDI(int num)
    {
        if(num==0)
        return ;

        System.out.println("Hi " + num);
        PDI(num-1);
        System.out.println("Bye " + num);
    }
    
}
