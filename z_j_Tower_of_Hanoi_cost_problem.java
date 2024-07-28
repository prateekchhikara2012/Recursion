public class z_j_Tower_of_Hanoi_cost_problem {

    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 2 }, { 2, 0, 1 }, { 3, 2, 0 } };

        System.out.println(fun(3, 0, 2, 1, arr));
    }

    public static int fun(int num, int s, int d, int h, int arr[][]) {
        if (num == 0) return 0;
        int x = fun(num - 1, s, h, d, arr);
        int z = arr[s][d];
        int y = fun(num - 1, h, d, s, arr);

        return x + y + z;
    }
}
