package spaceShip;

import java.io.IOException;
import java.util.ArrayList;

public class SimulationMain {

	public static void main(String[] args) {

		Simulation simulation = new Simulation();

		try {
			ArrayList<Item> list = simulation.loadItems();
			ArrayList<Rocket> r1List = simulation.loadU1(list);
			double budgetR1 = simulation.runSimulation(r1List);
			System.out.println("Total cost for R1 Fleet: $" + budgetR1 + " {costs of Rockets}");
			ArrayList<Rocket> r2List = simulation.loadU2(list);
			double budgetR2 = simulation.runSimulation(r2List);
			System.out.println("Total cost for R2 Fleet: $" + budgetR2 + " {costs of Rockets}");
		}

		catch (IOException e) {

			e.printStackTrace();
		}

	}

}