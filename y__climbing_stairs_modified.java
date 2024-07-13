public class y__climbing_stairs_modified {


    //   Dynamic calls --- (Calls  Vary) ---Jump are fized that is 123 
    public static void main(String[] args) {
        
        int arr[] ={2,1,3,2,4};

        fun(arr, 0 ," ",0);
        
    }
    public static void fun(int [] arr , int index , String ans , int sum) {


        if(sum==5)
        {
            System.out.println(ans);
            return ;
        }
        if(sum>5)
        {
            return;
        }



        for(int i=1;i<=arr[index];i++)
        {
            fun(arr ,index+1 , ans+i, sum+i );
        }
    }
    
}
