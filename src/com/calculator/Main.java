package com.calculator;

import java.util.Scanner;

import com.operation.*;
import com.operation.Math;

public class Main {

	public static void main(String[] args) {
		//int x = 2, y = 4;
		// Math mat = new Power();
		// System.out.println(mat.execute(x, y));
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("x: ");
			int x = scan.nextInt();
			System.out.println("y: ");
			int y = scan.nextInt();
			scan.nextLine();
			System.out.println("a -> Add | s -> Subtract | d -> Divide | m -> Multiply | p -> Power");
			String op = scan.nextLine();
			calculate(x, y, op);
		}

	}

	private static void calculate(int x, int y, String op) {
		switch(op) {
		case "a":
			Math add = new Add();
			System.out.println(add.execute(x, y));
			break;
		case "s":
			Math sub = new Subtract();
			System.out.println(sub.execute(x, y));
			break;
		case "d":
			Math div = new Divide();
			System.out.println(div.execute(x, y));
			break;
		case "m":
			Math mul = new Multiply();
			System.out.println(mul.execute(x, y));
			break;
		case "p":
			Math pow = new Power();
			System.out.println(pow.execute(x, y));
			break;
		default:
			System.out.println("Invalid Op");
			break;
		}
	}
}
