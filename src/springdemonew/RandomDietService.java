package springdemonew;

import java.util.Random;
public class RandomDietService implements DietService{

    private Random random = new Random();
    @Override
    public String getDiet() {
        String[] dietPlans = {"Follow a vegetarian diet",
        "Follow a high-protein diet",
        "Follow a fruit-rich diet"};

        int index = random.nextInt(dietPlans.length);

        return dietPlans[index];

    }
}
