import java.util.Scanner;

public class A136 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = scanner.nextInt();
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
}