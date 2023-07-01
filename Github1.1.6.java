import java.util.Scanner;
public class Sixth {
    private static boolean mishen(){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите значение координаты x:");
        float x = a.nextFloat();
        System.out.println("Введите значение координаты y:");
        float y = a.nextFloat();
        if(x<=1 && y<=2 && x>=-1 && y >=0)
            return true;
        else if(x<=2 && y<=0 && x>=-2 && y >=1.5)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(mishen());

    }


}
