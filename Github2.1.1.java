import java.util.Scanner;
public class A211 {
    static public void main(String[] args){
        Scanner x = new Scanner(System.in);
       int [] a = new int[10];
       int sum = 0;
        System.out.println("Enter the number: ");
        int k = x.nextInt();
        for(int i = 0; i < 4; i++){
            System.out.println("Enter the element: ");
            int w = x.nextInt();
            a[i]=w;
        }
        for(int z = 0;z<10;z++){
            if(a[z] % k ==0)
               sum+=a[z];
        }
        System.out.println("Summa: " + sum);
    }
}
