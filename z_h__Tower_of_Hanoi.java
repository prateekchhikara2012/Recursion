public class z_h__Tower_of_Hanoi {
    public static void main(String[] args) {
        
        fun(19, "S", "D", "H");
    }

    public static void fun(int num , String Source ,String Destination , String Helper)
    {

        if(num==0 )
        {
            return ;
        }
        //  problem says that use move num-1  from source to the helper using the destination 

        fun(num-1, Source, Helper, Destination);

        System.out.println("Move "+ num+" Disk From " +Source +" To "+Destination);

        fun(num-1 , Helper ,Destination , Source);




    }
}
