package springdemonew;

public class FootballCoach implements Coach{

    //define a private field for the dependency
    private DietService dietService;

    //define a constructor for dependency injection
    public FootballCoach(DietService dietService){
        this.dietService = dietService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 30 minutes of shooting practice";
    }

    @Override
    public String getDailyDiet() {
        //use my dietService
        return dietService.getDiet();
    }

    @Override
    public String getEmailAddress() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }
}
