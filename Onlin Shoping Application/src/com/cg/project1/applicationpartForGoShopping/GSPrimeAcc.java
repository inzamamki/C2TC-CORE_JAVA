package com.cg.project1.applicationpartForGoShopping;

import com.cg.project1.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float Charges = 0;

	public float getCharges() {
		return Charges;
	}

//	Constructor
	public GSPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		super(AccNo, accNm, charges, isPrime);
	}

	@Override
	public void bookProduct(float f) {
		super.bookProduct(f);
	}

	@Override
	public String toString() {
		return "Welcome to GoShopping\n" + super.toString();
	}

////	Override
//	public void bookProduct(float charges) {
//		System.out.println("Dear Prime User, Your Product Charges are : " + charges );
//	}

}