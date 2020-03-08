package etask5;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class House_Construction {
	private static final Logger LOGGER = LogManager .getLogger(House_Construction.class);
	public double cost(String standard_material,String fully_automated,double sq_feet) {
		double cost=0;
		if(standard_material=="yes" && fully_automated=="no") {
			cost=sq_feet*1200;
		}
		else if(standard_material=="above" && fully_automated=="no") {
			cost=sq_feet*1500;
		}
		else if(standard_material=="high" && fully_automated=="no") {
			cost=sq_feet*1800;
		}
		else if(standard_material=="high" && fully_automated=="yes") {
			cost=sq_feet*2500;
		}
		LOGGER . debug("Final Bill"+ cost);
		return cost;
	}

}
