import java.util.Scanner;

public class A137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        System.out.print("Цифры, входящие в запись обоих чисел: ");
        for (int i = 0; i < str1.length(); i++) {
            char digit = str1.charAt(i);
            if (str2.contains(String.valueOf(digit))) {
                System.out.print(digit + ", ");
            }
        }
    }
}

