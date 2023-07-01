import java.util.Scanner;
public class A121 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value of the first corner: ");
        int a = x.nextInt();
        System.out.println("Enter the value of the second corner: ");
        int b = x.nextInt();
        int tr = a+b;
        if(tr < 180 ){
            if(tr == 90)
                System.out.println("Triangle, rectangular");
            else
                System.out.println("Triangle, not rectangular");
        }
        else
            System.out.println("Not a triangle");
    }
}
