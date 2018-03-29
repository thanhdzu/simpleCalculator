package com.calculator;

public class Calculator {
	private int add(int x, int y) {
		return (x + y);
	}

	private int subtract(int x, int y) {
		return (x - y);
	}

	private int multiply(int x, int y) {
		return (x * y);
	}

	private int divide(int x, int y) {
		return (x / y);
	}

	private double power(int x, int y) {
		double total = 1;
		for (int i = 0; i < y; i++)
			total *= x;
		return total;
	}

	public void calculate(int x, int y, char op) {
		if (op == 'a')
			System.out.println(add(x, y));
		else if (op == 's')
			System.out.println(subtract(x, y));
		else if (op == 'd') {
			System.out.println(divide(x, y));
		} else if (op == 'm') {
			System.out.println(multiply(x, y));
		} else if (op == 'p') {
			System.out.println(power(x, y));
		} else {
			System.out.println("Invalid Op");
		}
	}
}
