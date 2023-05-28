package spaceShip;

import java.util.Random;

public class RocketR1 extends Rocket {

	public RocketR1() {
		super(100, 10000, 18000);
	}

	Random rand = new Random();

	@Override
	public boolean launch() {
		double randomProbability = rand.nextDouble();
		double chanceOfLaunchExplosion = 0.05 * (getWeight() / getCargoLimit());
		if (randomProbability > chanceOfLaunchExplosion) {
			return true;
		}
		return false;
	}

	@Override
	public boolean land() {
		double randomProbability = rand.nextDouble();
		double chanceOfLaunchExplosion = 0.01 * (getWeight() / getCargoLimit());
		if (randomProbability > chanceOfLaunchExplosion) {
			return true;
		}
		return false;
	}

}
