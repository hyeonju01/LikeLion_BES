package week5.Oct_18th.Algorithm;

public class RectangleStar {

    void printStar(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RectangleStar rs = new RectangleStar();
        rs.printStar(3, 4);
    }
}
