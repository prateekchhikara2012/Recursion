public class q__last_index_occurance {
    public static void main(String[] args) {
        int [] arr={10,30,50,30,60};
        System.out.println(fun(arr,0,30));
    }
    public static int fun(int [] arr, int index, int num)
    {
        if(arr.length==index)
        return -1;


        int x=fun(arr, index+1,num);

        if(x==-1 && arr[index]==num)
        {
            return index;
        }

        return x;
    }
    
}
