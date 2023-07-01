import java.util.Scanner;
public class A131 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = x.nextInt();
        int sum = 0;
        while(a > 0){
            sum+=a;
            a--;
        }
        System.out.println("Summa:" + sum);


    }
}
