package springdemonew;

public class BalancedDietService implements DietService{

    @Override
    public String getDiet() {
        return "Diet should have a balance of carbs, protein and healthy fats";
    }
}
