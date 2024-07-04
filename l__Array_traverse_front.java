public class l__Array_traverse_front
{
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};

        fun(arr,0);

    }
    public static void fun(int [] arr , int v_index)
    {
        if(v_index==arr.length)
        {
            return ;
        }

        System.out.print(arr[v_index]+" ");

        fun(arr, v_index+1);
    }
}