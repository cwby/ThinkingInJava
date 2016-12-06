package BOps;

/** Objects, Exercise 4:
 * (2) Write a program that calculates velocity using a constant distance and a constant time.  
 *  * @author joe
 *
 */
public class BOps04 {
	/** Create a method that calculate velocity, given distance and time 
	 * @param distanceInMeters Distance (in meters)
	 * @param timeInSeconds Time (in seconds)
	 */
	private double velocity(double distanceInMeters, int timeInSeconds) {
		double v = distanceInMeters / timeInSeconds ;
		/** @return Meters per second */
		return v ;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BOps04 myObj = new BOps04();
		double myV = myObj.velocity(120,11);
		System.out.println("myV="+ myV);

	}

}
