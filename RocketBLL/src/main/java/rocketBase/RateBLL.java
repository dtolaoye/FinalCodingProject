package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		RateDomainModel model = null;
		
		try {
			ArrayList<RateDomainModel> rate = RateDAL.getAllRates();
			for(int i = 0; i<rate.size(); i++){
				if(GivenCreditScore == rate.get(i).getiMinCreditScore()){
					dInterestRate = rate.get(i).getdInterestRate();
					
			}
				else if(dInterestRate < 0 || model == null){
					throw new RateException(model);
			}
				
		}
					
			}catch(RateException exp){
				System.out.println("No rate was found");
				
		}
	
		
		return dInterestRate;
		
		
	}
	
	
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
