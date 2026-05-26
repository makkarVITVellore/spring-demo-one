package springdemonew;

public class TrackCoach implements Coach {

    private String emailAddress;

    private String team;

    //create a no-arg constructor to analyze what spring is doing behind the scenes
    public TrackCoach(){
        System.out.println("Inside TrackCoach's No-Arg Constructor");
    }
    private DietService dietService;

    //setter method for setter injection
    public void setDietService(DietService dietService){
        System.out.println("TrackCoach: Inside setter method - setDietService");
        this.dietService = dietService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("TrackCoach: Inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("TrackCoach: Inside setter method - setTeam");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyDiet() {
        return dietService.getDiet();
    }
}
