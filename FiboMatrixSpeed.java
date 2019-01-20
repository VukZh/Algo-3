package fibo;

import java.math.BigInteger;

public class FiboMatrixSpeed {

    static BigInteger fib(int n) {

        if (n == 0) {
            return BigInteger.valueOf(0);
        }
        return power(n - 1)[0][0];
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

    }

    static BigInteger[][] power(int n) {
        BigInteger[][] F0 = new BigInteger[][]{{BigInteger.valueOf(1), BigInteger.valueOf(1)}, {BigInteger.valueOf(1), BigInteger.valueOf(0)}};
        BigInteger[][] F1 = new BigInteger[][]{{BigInteger.valueOf(1), BigInteger.valueOf(0)}, {BigInteger.valueOf(0), BigInteger.valueOf(1)}};
        while (n > 0) {
            if (n % 2 != 0) {
                multiply_matrices(F1, F0);
            }
            multiply_matrices(F0, F0);
            n = n / 2;
        }
        return F1;
    }

}
