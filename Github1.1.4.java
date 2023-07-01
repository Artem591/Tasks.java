import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Введите значение переменной R: ");
        double R = x.nextDouble();
        double a = R / 1 / 1000;
        double b = R % 1 * 1000;
        double r = a + b;
        String r1 = String.format("%.3f",r);
        System.out.println("Значение r =" + r1);
    }
}
