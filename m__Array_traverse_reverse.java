public class m__Array_traverse_reverse {
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};
        int i=arr.length-1;
        fun(arr,i);
    }

    public static void fun(int arr[] , int v_index)
    {
        if(v_index==-1)
        return ;

        System.out.print (arr[v_index]+" ");
        fun(arr,v_index-1);

    }
    
}
