public class n__Array_traverse_reverse_from_front
{
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};

        fun(arr,0);
    }
    public static void fun(int [] arr,int index)
    {

        if(index==arr.length)
        {
            return;
        }
        fun(arr,index+1);

        System.out.print(arr[index]+" ");

    }
}