package springdemo;

public class TennisCoach implements Coach 
{
	private FortuneService fortuneService;
	
	
	public TennisCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "do backhand practice for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it! "+fortuneService.getFortune();
	}
}
