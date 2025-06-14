import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A, B;
        int C;
        double D;
        char E;

        A = scanner.nextLine();
        B = scanner.next();
        C = scanner.nextInt();
        D = scanner.nextDouble();
        E = scanner.next().charAt(0);

        scanner.close();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
    }
}