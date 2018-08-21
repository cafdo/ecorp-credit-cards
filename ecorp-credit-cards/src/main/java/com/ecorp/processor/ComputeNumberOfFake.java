package com.ecorp.processor;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component
public class ComputeNumberOfFake {
	private BigInteger numberOfFake = BigInteger.valueOf(1);
	public BigInteger getNumberOfFakeByDay(BigInteger a) {
		System.out.println("Entro al método de calculo: ");
		Util ut = new Util();
		BigInteger 
		numberOfFake = ut.toSquare(a).multiply(ut.factorial(a.subtract(BigInteger.valueOf(1))));
		System.out.println("Termino el método de calculo: "+numberOfFake);
		return numberOfFake;
	}
	public BigInteger getNumberOfFake() {
		return numberOfFake;
	}
	public void setNumberOfFake(BigInteger numberOfFake) {
		this.numberOfFake = numberOfFake;
	}
}
