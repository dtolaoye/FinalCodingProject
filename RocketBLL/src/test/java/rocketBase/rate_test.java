package rocketBase;

import static org.junit.Assert.*;

import org.hibernate.HibernateException;
import org.junit.Test;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class rate_test {

	@Test
	public void test1(){
		RateDomainModel domod = new RateDomainModel();
		domod.setdInterestRate(20);
		domod.setiMinCreditScore(1);
		domod.setiRateID(2);
		assertTrue(domod.getdInterestRate() == 20);
	}

	@Test
	public void test2() throws RateException{
		RateDomainModel model = new RateDomainModel();
		model.setdInterestRate(0);
		model.setiMinCreditScore(3);
		model.setiRateID(1);
	try{
		model.getdInterestRate();
	}catch(HibernateException exp) {
		if (model.getdInterestRate() >= 6)
			exp.printStackTrace();
	}
				
		
	}
}


