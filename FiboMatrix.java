import java.math.BigInteger;

public class FiboMatrix {

    static BigInteger fib(int n) {
        BigInteger[][] F = new BigInteger[][]{{BigInteger.valueOf(1), BigInteger.valueOf(1)}, {BigInteger.valueOf(1), BigInteger.valueOf(0)}};
        if (n == 0) {
            return BigInteger.valueOf(0);
        }
        power(F, n - 1);
        return F[0][0];
    }

    static void power(BigInteger F[][], int n) {
        int i;
        BigInteger[][] F0 = new BigInteger[][]{{BigInteger.valueOf(1), BigInteger.valueOf(1)}, {BigInteger.valueOf(1), BigInteger.valueOf(0)}};
        for (i = 2; i <= n; i++) {

//            System.out.print("step " + i + ": "); //////// 2

            multiply_matrices(F, F0);
        }
    }

    static void multiply_matrices(BigInteger F1[][], BigInteger F2[][]) {
        BigInteger a = (F1[0][0].multiply(F2[0][0])).add(F1[0][1].multiply(F2[1][0]));
        BigInteger b = (F1[0][0].multiply(F2[0][1])).add(F1[0][1].multiply(F2[1][1]));
        BigInteger c = (F1[1][0].multiply(F2[0][0])).add(F1[1][1].multiply(F2[1][0]));
        BigInteger d = (F1[1][0].multiply(F2[0][1])).add(F1[1][1].multiply(F2[1][1]));

        F1[0][0] = a;
        F1[0][1] = b;
        F1[1][0] = c;
        F1[1][1] = d;

//        System.out.println(a);  ///////// 1

    }

    public static void main(String[] args) {
        int n = 10000;
        System.out.println(fib(n));
    }

}
