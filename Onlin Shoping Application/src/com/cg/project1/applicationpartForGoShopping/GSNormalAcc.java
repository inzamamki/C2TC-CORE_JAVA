package com.cg.project1.applicationpartForGoShopping;

import com.cg.project1.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	
//	Constructor
	public GSNormalAcc(int AccNo, String accNm, float charges, boolean isPrime) {
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

//	Default Constructor - as per PDF
//	public GSNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
//		super(AccNo, accNm, charges, deliveryCharges);
//	}

//	@Override
//	public void bookProduct(float charges) {
//		System.out.println("Dear Normal User, Your Product Charges are : " + charges + " with Delivery charges is : "
//				+ super.getDeliveryCharges());
//	}

}