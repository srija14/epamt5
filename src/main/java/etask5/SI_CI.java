package etask5;

//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SI_CI {
	private static final Logger LOGGER = LogManager . getLogger(SI_CI. class);
	public double SimpleInterest(double p,int t,double r) {
		
		double amnt=p*t*r/100;
		LOGGER . debug("Simple_Interest"+ amnt);
		return amnt;
	}
	public double CompoundInterest(double p,int t,double r) {
		double amnt=p*Math.pow(1+(r/100), t);
		LOGGER . debug("Compound_Interest"+ amnt);
		return amnt;
	}

	
}
