public class A132 {
    public static void main(String[] args){
    int n = 1;
    int sum = 0;
    while(101>n){
        sum += Math.pow(n,2);
        n++;
    }
        System.out.println("Summa: " + sum);
    }
}
