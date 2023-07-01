import java.util.Scanner;
public class A123 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the value x1:");
        float x1 = a.nextFloat();
        System.out.println("Enter the value y1:");
        float y1 = a.nextFloat();
        System.out.println("Enter the value x2:");
        float x2 = a.nextFloat();
        System.out.println("Enter the value y2:");
        float y2 = a.nextFloat();
        System.out.println("Enter the value x3:");
        float x3 = a.nextFloat();
        System.out.println("Enter the value y3:");
        float y3 = a.nextFloat();
        if((x1 == x2 && x2 == x3) || (y1 == y2 && y2== y3))
            System.out.println("On one straight line");
        else
            System.out.println("Not on one straight line");
    }
    }
