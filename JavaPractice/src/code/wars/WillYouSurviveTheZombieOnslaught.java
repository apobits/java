package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WillYouSurviveTheZombieOnslaught {
    public static void main(String[] args) {
	assertEquals("You shot all 3 zombies.", zombieShootout(3, 10, 10));
	assertEquals("You shot 16 zombies before being eaten: overwhelmed.", zombieShootout(100, 8, 200));
	assertEquals("You shot 8 zombies before being eaten: ran out of ammo.", zombieShootout(50, 10, 8));
    }

    public static String zombieShootout(int zombies, int range, int ammo) {
	System.out.printf("zombies %s, range %s, ammo %s\n", zombies, range, ammo);

	int secondsToBeEaten = range * 2;

	if (zombies <= secondsToBeEaten) {
	    if (ammo >= zombies) {
		return "You shot all " + zombies + " zombies.";
	    } else {
		return "You shot " + ammo + " zombies before being eaten: ran out of ammo.";
	    }
	} else {
	    if (ammo >= secondsToBeEaten) {
		return "You shot " + secondsToBeEaten + " zombies before being eaten: overwhelmed.";
	    } else {
		return "You shot " + ammo + " zombies before being eaten: ran out of ammo.";
	    }
	}
    }

    public static String zombieShootout2(int zombies, int range, int ammo) {
	System.out.printf("zombies %s, range %s, ammo %s\n", zombies, range, ammo);
	if ((zombies <= range * 2) && (ammo >= zombies)) {
	    return "You shot all " + zombies + " zombies.";
	}
	if (range * 2 > ammo) {
	    return "You shot " + ammo + " zombies before being eaten: ran out of ammo.";
	} else {
	    return "You shot " + range * 2 + " zombies before being eaten: overwhelmed.";
	}
    }
}
