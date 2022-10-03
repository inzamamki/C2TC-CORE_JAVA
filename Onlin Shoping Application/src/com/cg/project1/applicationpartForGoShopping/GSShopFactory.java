package com.cg.project1.applicationpartForGoShopping;

import com.cg.project1.framework.*;

public class GSShopFactory implements ShopFactory {
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsPrime.toString());
		return GsPrime;
	}

	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSNormalAcc GsNormal = new GSNormalAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsNormal.toString());
		return GsNormal;
	}
	
	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}
}