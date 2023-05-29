package spaceShip;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Simulation {

	ArrayList<Item> itemList = new ArrayList<Item>();
	Rocket rocket = new Rocket();

	public ArrayList<Item> loadItems() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("G:\\Software Testing 2023\\Items.txt"));

		String data = reader.readLine();
		while ((data = reader.readLine()) != null) {
			String toolArray[] = data.split("=");
			String name = toolArray[0];
			int weight = Integer.parseInt(toolArray[1]);
			Item item = new Item(name, weight);
			itemList.add(item);
		}
		reader.close();
		return itemList;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> list) {

		ArrayList<Rocket> rockets = new ArrayList<Rocket>();
		RocketR1 r1 = new RocketR1();
		for (Item item : list) {
			if (r1.canCarry(item)) {
				r1.carry(item);
				rockets.add(r1);
			}
		}
		return rockets;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> list) {

		ArrayList<Rocket> rockets = new ArrayList<Rocket>();
		RocketR2 r2 = new RocketR2();
		for (Item item : list) {
			if (r2.canCarry(item)) {
				r2.carry(item);
				rockets.add(r2);
			}
		}
		return rockets;
	}

	public double runSimulation(ArrayList<Rocket> rockets) {
		double totalBudget = 0;
		for (Rocket rocketList : rockets) {
			rocketList.land();
			rocketList.launch();
			totalBudget += rocketList.getCost();
			if (rocketList.land() == false || rocketList.launch() == false) {
				for (Rocket rocketList2 : rockets) {
					rocketList2.land();
					rocketList2.launch();
				}
				totalBudget += rocketList.getCost();
			}

		}
		return totalBudget;
	}
}
