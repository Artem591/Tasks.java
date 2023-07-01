import java.util.Scanner;

public class A134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число е: ");
        double e = scanner.nextDouble();

        double sum = 0;
        for (int i = 1;i <= 10 ; i++) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("Сумма членов ряда: " + sum);
    }
}