package com.ecorp.processor;

import java.math.BigInteger;

public class Util {
	public BigInteger factorial(BigInteger number) {
	    BigInteger result = BigInteger.valueOf(1);
	    for (long factor = 2; factor <= number.longValue(); factor++) {
	        result = result.multiply(BigInteger.valueOf(factor));
	    }
	    return result;
	}
	public BigInteger toSquare(BigInteger number) {
		   BigInteger result = BigInteger.valueOf(1);
		   result = number.multiply(number);
		   return result;
	}
	
}
