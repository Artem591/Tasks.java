import java.util.ArrayList;
import java.util.Scanner;

public class A214 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int imax = -1;
        int imin = -1;
        System.out.println("Enter the number of array elements: ");
        int size = x.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter an array element: ");
            int num = x.nextInt();
            array.add(num);
        }
        for (int j = 0; j < array.size(); j++) {
            if (array.get(j)>max) {
                max = array.get(j);
                imax = j;
            }
            else if(array.get(j)<min) {
                min = array.get(j);
                imin = j;
            }
            else
                continue;
        }
        System.out.println(array);
        array.set(imin,max);
        array.set(imax,min);
        System.out.println(array);
    }
}