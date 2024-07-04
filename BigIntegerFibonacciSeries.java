//This program prints the Fibonacci series using BigInteger in Java

import java.math.BigInteger;
public class BigIntegerFibonacciSeries {
    public static void main(String args[])
    {
        int n = 100;
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for(int i=2;i<=n;i++)
        {
            c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println("Fibonacci number = "+b);
    }
}