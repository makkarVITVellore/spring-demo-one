package springdemo;

public class TrackCoach implements Coach 
{
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	
	public TrackCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "run 3 km";
	}

	@Override
	public String getDailyFortune() 
	{
		return "Go ahead, " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo()
	{
		System.out.println("Trackcoach: inside method doMyCleanupStuffYoYo");
	}
	
}
