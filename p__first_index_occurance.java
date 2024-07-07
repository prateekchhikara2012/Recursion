public class p__first_index_occurance {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,7,2,3,1,1};
        // to find out the first occurance of the number

       System.out.println( fun(arr,0,1));

    }
    public static int fun(int [] arr, int index, int num)//bp
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==num)
        return index;


        int x=fun(arr,index+1,num);//sp

        return x;
    }
    
}
