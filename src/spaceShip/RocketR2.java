package spaceShip;

import java.util.Random;

public class RocketR2 extends Rocket {

	public RocketR2() {
		super(120, 18000, 29000);
	}

	Random rand = new Random();

	@Override
	public boolean launch() {

		double randomProbability = rand.nextDouble();
		double chanceOfLaunchExplosion = 0.04 * (getWeight() / getCargoLimit());
		if (randomProbability > chanceOfLaunchExplosion) {
			return true;
		}
		return false;
	}

	@Override
	public boolean land() {
		double randomProbability = rand.nextDouble();
		double chanceOfLaunchExplosion = 0.08 * (getWeight() / getCargoLimit());
		if (randomProbability > chanceOfLaunchExplosion) {
			return true;
		}
		return false;
	}
}
