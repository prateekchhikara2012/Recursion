public class e__print_increasing_decreasing {
    
    public static void main(String[] args) {
        // you have to print the increasing and than decreasing 
        // output --  1->n n->1
        int num=4;
        System.out.println("Start");
        PID(1,num);
        System.out.println("End");
    }
    public static void PID(int i,int num)
    {
        // if(i==num+1)
        if(i>num)
        return;

        System.out.println(i);
        PID(i+1,num);
        System.out.println(i);
    }
    
}
