package lab;

public class RoadTripLog { // makes instances
	double distance;
	double fuel;
	double mpg;
	String place;
	
	public RoadTripLog(String placeName) { // assigns placeName to place and sets the others to 0
		place = placeName;
		distance = 0;
		fuel = 0;
		mpg = 0;
	}
	
	public double getTotalDistance() { // gets the total distance
		return distance;
	}
	public double getTotalFuel() { // gets the total fuel
		return fuel;
	}
		
	public void addDistance(double amt) { // adds double amt to distance
		distance += amt;
	}
	
	public void addFuel(double amt) { // adds double amt to fuel
		fuel += amt;
	}
	
	public double getMPG() { // uses the formula to get mpg, rounds mpg too nearest tenth, then returns it
		mpg = distance/fuel;
		mpg = Math.round(mpg*10)/10.0;
		return mpg;
	}
	
	public String toString() { // makes the string that gets printed to say the final part
		return "Trip: " + place + " \n    Distance:  " + getTotalDistance()  + " \n    Fuel Used: " + getTotalFuel() + " \n    MPG:       " + getMPG() ;
	}
//	* Trip: Maryland 2022
//	 *    Distance:  995.7
//	 *    Fuel Used: 55.2
//	 *    MPG:       18.0
}
