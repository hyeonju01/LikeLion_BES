package week5.Oct_18th.Algorithm;

public class SquareStar {

    void printStar(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*"+" ");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareStar ss = new SquareStar();
        ss.printStar(3);
    }
}
