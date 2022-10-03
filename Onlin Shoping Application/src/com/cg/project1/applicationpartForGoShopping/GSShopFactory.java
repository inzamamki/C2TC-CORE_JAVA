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

//	@Override
//	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
//		PrimeAcc p = new GSPrimeAcc(accNo, accNm, charges, isPrime);
//		return p;
//	}
//	@Override
//	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
//
//		NormalAcc n = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
//		return n;
//	}

	public static void main(String[] args) {
//		float chg = sc.nextFloat();
//		float chg = 1000, dchg = 50;
//
//		GSShopFactory u = new GSShopFactory();
//
//		PrimeAcc p = u.getNewPrimeAccount(1, "Akash1", chg, true);
//		NormalAcc n = u.getNewNormalAccount(2, "Akash2", chg, dchg);
//
//		p.bookProduct(chg);
//		n.bookProduct(chg);

	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}

}