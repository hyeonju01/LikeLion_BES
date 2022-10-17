package week4.Oct_14th.Algorithm;

public class fibonachi {

    public int fibo(int n) {

        if (n <= 1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        fibonachi fibo = new fibonachi();
        System.out.println(fibo.fibo(3));

        // fibo(3) -> fibo(2)              +   fibo(1)
        //            -> fibo(1) + fibo(0)     -> 1
        //               ->  1   +   0



    }
}
