package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void test1(){
		RateDomainModel domo1 = new RateDomainModel();
		domo1.setdInterestRate(2.3);
		domo1.setiMinCreditScore(120);
		domo1.setiRateID(1);
		
		assertTrue(domo1.getdInterestRate() == 2.3);
	}
	
	@Test
	public void test2(){
		RateDomainModel domo2 = new RateDomainModel();
		domo2.setdInterestRate(4.5);
		domo2.setiMinCreditScore(9);
		domo2.setiRateID(2);
		try{
			domo2.getdInterestRate();
		}
		catch(HibernateException exp) {
			if (domo2.getdInterestRate() >= 6)
				exp.printStackTrace();
		}
	}
}


