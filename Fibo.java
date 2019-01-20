package fibo;

public class Fibo {

    public static void main(String[] args) {
        int n = 100000;

        long startTime1 = System.currentTimeMillis();
        System.out.println(FiboMatrix.fib(n));
        long timeSpent1 = System.currentTimeMillis() - startTime1;
        System.out.println("время выполнения " + timeSpent1 + " миллисекунд");

        long startTime2 = System.currentTimeMillis();
        System.out.println(FiboMatrixSpeed.fib(n));
        long timeSpent2 = System.currentTimeMillis() - startTime2;
        System.out.println("время выполнения оптимизированной версии " + timeSpent2 + " миллисекунд");
    }

}
