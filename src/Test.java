import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the first number");
        int x = sc.nextInt();
        System.out.println("write the second number");
        int y = sc.nextInt();
        System.out.println("the result of the add is " + add(x,y));
        Runnable runnable = new MultiThread(x,y);
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static int add(int x, int y){
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
        System.out.println("the result of the substract is " + result);
    }
}