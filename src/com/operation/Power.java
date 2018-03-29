package com.operation;

public class Power extends Math {

	@Override
	public double execute(double x, double y) {
		double total = 1;
	    for (int i = 0 ; i < y; i ++)
	      total *= x;
	    return total;
	}

}
