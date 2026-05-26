package springdemonew;

public class BaseballCoach implements Coach{

    private DietService dietService;

    public BaseballCoach(DietService dietService) {
        this.dietService = dietService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyDiet() {
        return "Just follow this: " + dietService.getDiet();
    }

    @Override
    public String getEmailAddress() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }

    //add an init method
    public void doMyStartupStuff(){
        System.out.println("BaseballCoach: inside method doMyStartupStuff");
    }

    //add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("BaseballCoach: inside method doMyCleanupStuff");
    }
}
