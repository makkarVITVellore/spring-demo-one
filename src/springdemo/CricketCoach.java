package springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() 
	{
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) 
	{
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	public String getTeam() 
	{
		return team;
	}
	
	public void setTeam(String team) 
	{
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	//create a no-arg constructor -- spring will call this while creating object of this class
	public CricketCoach()
	{
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "practice fast bowling for 20 mins";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
