import java.util.ArrayList;
import java.util.Scanner;

public class A2110 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int size = x.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter an array element: ");
            int num = x.nextInt();
            array.add(num);
        }
        System.out.println(array);
        for (int j = 1; j < array.size(); j += 2) {
            array.set(j,0);
        }
        System.out.println(array);
        }
    }

