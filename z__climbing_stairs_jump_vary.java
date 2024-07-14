public class z__climbing_stairs_jump_vary {
    public static void main(String[] args) {
        



        // --------- IMPORTANT THINGS TO SEE

        // 1)-- call.length>=5 becasuse agar by chance arr 1 ka jump le rha hai to 
        //      kaam se kaam 5 call to chaiye usse


        // 2)-- call[index] <= jumps.length beacuse agar call 5 ki lag rii hai aur arr ki 
        //      length he 3 hai to arr out of bound chale jayega






        int arr[]={2,1,3,2,4};
        int call [] ={1,3,4,3,2};


        fun(arr, 0, "",0,call);

    }
    public static void fun(int arr[] , int index, String ans , int sum , int [] call) {


        if(sum==5)
        {
            System.out.println(ans);
            return ;
        }
        if(sum>5)
        {
            return;
        }



        for(int i=0;i<arr[index];i++)
        {
            fun(arr, index+1, ans+call[i],sum+call[i],call);
        }
        
    }
    
}
