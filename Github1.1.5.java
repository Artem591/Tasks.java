import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите кол-во секунд: ");
        int seconds = x.nextInt();
        int sec = seconds % 60;
        int min = (seconds / 60) % 60;
        int h = seconds / 3600;
        System.out.printf("%02dч %02dмин %02dс",h,min,sec);

    }
}
