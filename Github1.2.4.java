import java.util.Scanner;
public class A124 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the value A:");
        float A = a.nextFloat();
        System.out.println("Enter the value B:");
        float B = a.nextFloat();
        System.out.println("Enter the value x:");
        float x = a.nextFloat();
        System.out.println("Enter the value y:");
        float y = a.nextFloat();
        System.out.println("Enter the value z:");
        float z = a.nextFloat();
        if((A == x && B == y)||(A == x && B == z)||(A == z && B == y)||(A == y && B == x)||(A == z && B == x)||(A == y && B == z))
            System.out.println("It will pass");
        else
            System.out.println("It won't pass");
    }
}

