public class A133 {
    public static void main(String[] args){
        int n = 1;
        long sum = 1;
        while(201>n){
            sum *= Math.pow(n,2);
            n++;
        }
        System.out.println("Summa: " + sum);
    }
}

