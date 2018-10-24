import java.util.Scanner;

public class Test {
    Thread thread;
    public static void main(String[] args) {
        Test test = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.println("write the first number");
        int x = sc.nextInt();
        System.out.println("write the second number");
        int y = sc.nextInt();
        System.out.println("the result of the add is " + test.add(x,y));
        Runnable runnable = new MultiThread(x,y);
         test.thread = new Thread(runnable);
         test.thread.start();
         test.thread.interrupt();
         while(!test.thread.isInterrupted()){
             System.out.println("thread substract is interrupted");
         }
    }

    public int add(int x, int y){ // Método sumar .
        int result = x + y ;
        return result;

    }

}

class MultiThread implements  Runnable{ // Implementamos clase Runnable
    public MultiThread(int x, int y){ // Creamos constructor con los parametros necesarios
        this.x = x;
        this.y = y;
    }
    private int x;
    private int y;
    @Override
    public void run() { // Escribimos el método que s eva a ejecutar simultaneamente
        int result = x - y ;
        System.out.println("the result of the substract is " + result);
    }
}