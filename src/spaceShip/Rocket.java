package spaceShip;

public class Rocket implements SpaceShip {
	private double cost;
	private double weight;
	private double cargoLimit;

	Rocket() {
	}

	public Rocket(double cost, double weight, double cargoLimit) {
		this.cost = cost;
		this.weight = weight;
		this.cargoLimit = cargoLimit;
	}

	public double getCost() {
		return cost;
	}

	public double getWeight() {
		return weight;
	}

	public double getCargoLimit() {
		return cargoLimit;
	}

	public boolean launch() {

		return true;
	}

	public boolean land() {
		return true;
	}

	public boolean canCarry(Item item) {
		double totalWeight = item.getWeight() + weight;
		if (totalWeight > cargoLimit) {
			return false;
		}
		return true;
	}

	public void carry(Item item) {
		weight = item.getWeight() + weight;
	}
}
