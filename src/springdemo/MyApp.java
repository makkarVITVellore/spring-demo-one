package springdemo;

public class MyApp {

	public static void main(String[] args) 
	{
		//create and use the object
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		
		/*Now what if we want to get the info about our daily workout from a track coach or maybe a gymnastics coach
		 *In that case we will have to edit our source code.*/
	}

}
	