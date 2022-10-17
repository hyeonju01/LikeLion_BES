package week5.Oct_17th;

public class RightTriangle {
    private char letter;

    public RightTriangle() {
        this.letter = '*';
    }

    //constructor overloading
    public RightTriangle(char letter) {
        this.letter = letter;
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        System.out.println("*"); i = 0 "*"
//        System.out.println("**"); i = 1 "**"
//        System.out.println("***"); i = 2 "***"
//        System.out.println("****"); i = 3 "****"
        RightTriangle r1 = new RightTriangle();
        r1.print(4);
        System.out.println("---");
        RightTriangle r2 = new RightTriangle('#');
        r2.print(4);
        System.out.println("---");
        RightTriangle r3 = new RightTriangle('@');
        r3.print(4);
    }
}
