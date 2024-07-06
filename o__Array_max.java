public class o__Array_max {
    public static void main(String[] args) {
        int arr[]={10,5,80,60,20 };

       System.out.println( fun(arr,0));
    }
    static int fun(int [] arr, int index)
    {
        //bc
        if(arr.length==index)
        return Integer.MIN_VALUE;


        //sp
        int x=fun(arr,index+1);
        

        return Math.max(x,arr[index]);

    }
    
}
