import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int strength, agility, intelligence ;
        Random rand = new Random();
        intelligence = rand.nextInt(21);
        agility = rand.nextInt(21-intelligence);
        intelligence += 10;
        agility += 10;
        strength = 50 - agility - intelligence;

        double orcHP = 1000;

        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        orcHP = orcHP - (5 * intelligence * (rand.nextDouble() + .5));
        if (orcHP <= 0) {
            System.out.println("You killed the orc");
        }
        else {
            System.out.print("The orc killed you and has " + orcHP + " HP left");
        }





    }
}
