import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int component = a;

            for (int j = 0; j < n; j++) {
                component += (int) (Math.pow(2,j)*b);
                System.out.println(component + " ");
            }

            scanner.close();

        }

    }
}