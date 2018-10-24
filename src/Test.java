import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el primer numero");
        int x = sc.nextInt();
        System.out.println("introduce el segundo numero");
        int y = sc.nextInt();
        System.out.println("El resultado de la suma es " + sumar(x,y));
        Runnable runnable = new MultiThread(x,y);
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static int sumar(int x, int y){
        int result = x + y ;
        return result;

    }

}

class MultiThread implements  Runnable{
    public MultiThread(int x, int y){
        this.x = x;
        this.y = y;
    }
    private int x;
    private int y;
    @Override
    public void run() {
        int result = x - y ;
        System.out.println("El resultado de la resta es " + result);
    }
}