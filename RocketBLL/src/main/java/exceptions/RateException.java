package exceptions;
import rocketDomain.RateDomainModel;


public class RateException extends Exception {
	public RateDomainModel model;
	
	public RateException(RateDomainModel model){
		super();
		this.model = model;
	}
	
	public RateDomainModel getModel(){
		return model;
	}

	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}
