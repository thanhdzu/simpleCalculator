package com.operation;

public class MathFactory {
	public Math get(int ch) {
		if (ch == 1) {
			return new Add();
		} else if (ch == 2) {
			return new Subtract();
		} else if (ch == 3) {
			return new Divide();
		} else if (ch == 4) {
			return new Multiply();
		} else if (ch == 5) {
			return new Power();
		} else
			return null;
	}
}
