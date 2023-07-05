public class Main {
    public static void main(String[] args) {

        int space = 1;

        for (int i = 1; i <= 7; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("*");
            }
            System.out.println();
            space = space + 2;
        }
    }
}