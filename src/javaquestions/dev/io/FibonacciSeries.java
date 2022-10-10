package javaquestions.dev.io;

import java.util.Scanner;

/*
 * Q: print the fibonacci series of given number using Recursion
 * input: 6
 * output: 0,1,1,2,3,5,8
 * 
 *NOTE: the program should note slow for the maximum number input
 *
 * */
public class FibonacciSeries {
	
	
	private static long[] fibonacciTemp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int input = sc.nextInt();
		fibonacciTemp = new long[input + 1];
		System.out.println("The Fibonacci Serise are: ");
		for (int i = 0; i <= input; i++) {
			System.out.print(fibonacciNum(i) + ", ");
		}
		sc.close();
	}

	private static long fibonacciNum(int n) {
		if (n <= 1)
			return n;
		if (fibonacciTemp[n] != 0)
			return fibonacciTemp[n];

		long nthFibonacciResul = (fibonacciNum(n - 1) + fibonacciNum(n - 2));
		fibonacciTemp[n] = nthFibonacciResul;
		return nthFibonacciResul;
	}

}
