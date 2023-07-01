import java.util.Scanner;
public class A122 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value a:");
        int a = x.nextInt();
        System.out.println("Enter the value b:");
        int b = x.nextInt();
        System.out.println("Enter the value c:");
        int c = x.nextInt();
        System.out.println("Enter the value d:");
        int d = x.nextInt();
        int z = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println("Answer: z = " + z);
    }
}