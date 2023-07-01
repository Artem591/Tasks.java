import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Введите значение переменной a: ");
        double a = x.nextDouble();

        System.out.print("Введите значение переменной b: ");
        double b = x.nextDouble();

        System.out.print("Введите значение переменной c: ");
        double c = x.nextDouble();
        double y = (b + Math.sqrt(b * b + 4 * a * c))/(2*a)-Math.pow(a,3)* c + Math.pow(b,-2);
        System.out.println("Значение функции y = " + y);
    }
}
