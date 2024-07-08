public class r__find_all_index {

    // given a array you have to find the occurance of the element
    // and store the index in other array

    public static void main(String[] args) {
        int arr[]={1,30,40,50,30,60,30};

        //to find 30
        int []x=fun(arr , 0 , 30,0);
        for(int i:x)
        {
            System.out.println(i);
        }
        
    }
    public static int[] fun(int [] arr , int index , int element,int count) {

        if(arr.length==index)
        {
            int xyz[]=new int [count];
            return xyz;
        }





        if(arr[index]==element)
        {
            int [] abc=fun(arr, index+1 ,element,count+1);
        
            abc[count]=index;
            return abc;
        }

        else
        { 
            return  fun(arr, index+1 ,element,count);
        }





        
    }
    
}
