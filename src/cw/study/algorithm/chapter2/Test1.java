package cw.study.algorithm.chapter2;

public class Test1 {


    public static long fib(int n)
    {
        if(n<=1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fib(2));
    }




}
