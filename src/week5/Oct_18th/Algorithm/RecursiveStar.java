package week5.Oct_18th.Algorithm;

public class RecursiveStar {

    void printARow(int n, String now){
        System.out.println(now);
        if (n == now.length()) {
            return;
        }
        printARow(n, now+"*");
    }

    public static void main(String[] args) {
        RecursiveStar rs = new RecursiveStar();
        rs.printARow(5, "*");
    }
}
