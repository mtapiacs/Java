package main;
import java.util.Random;

public class P231 {
	public static void main(String[] args) {
		// Welcome and Inputs for Round Checks/Length of Array
		System.out.println("Welcome to my EcoSystem!");
		
		// Create river with Bears, Fish, and Nulls
		Animal[] river = createEco(); // Make it instance variable of the whole class if not working
		
		// Simulation Runner
			// TO-DO: Scanner to tell the amount of round checks and length of array
		int roundAmount = 10;
		
		for (int ctr = 0; ctr < river.length; ctr++) {
			if (river[ctr] != null) {
				System.out.print(river[ctr].toString() + " ");	
			} else {
				System.out.print("null" + " ");
			}
		}
		System.out.println("");
		
		runSimulation(river, roundAmount);
		
		// Print out the array to the developer console
//		for (int ctr = 0; ctr < river.length; ctr++) {
//			if (river[ctr] != null) {
//				System.out.print(river[ctr].toString() + " ");	
//			} else {
//				System.out.print("null" + " ");
//			}
//		}
	}
	
	// Make array > 49
	public static Animal[] makeArr () {
		Animal[] river = new Animal[50];
		return river;
	}
	
	// Create ECOSYSTEM Loop that checks over everything and randomly decided what goes where  1-10 [1-3][4-6][7-10] String [] classx = new String[]{"Bear", "Fish" }; 
	public static Animal[] createEco() {
		Animal[] river = makeArr();
		for (int ctr = 0; ctr < river.length; ctr++) { // I can use an enum here can't I? with switch statement 
			Random rand  = new Random();
			int rEco = rand.nextInt(9);
			//System.out.println(rEco);
			if (rEco <= 2) {
				river[ctr] = new Bear();
			} else if (rEco <= 6) {
				river[ctr] = new Fish();
			} else {
				river[ctr] = null;
			}
		}
		return river;
	}
	
	// Simulation
	public static void runSimulation(Animal[] river, int roundAmount) {
		for (int i = 0; i < roundAmount; i++) {
			for (int j = 0; j < river.length-1; j++) {
				Random rand  = new Random();
				int rNum = rand.nextInt(2); // 0 is stay 1 is move
				if (river[j] == null) {continue;};
				if (river[j].toString().equals("Bear") && rNum != 0) {
					if (river[j+1] == null) {
						// Move to right and make the old position null
						river[j+1] = new Bear();
						river[j] = null;
						continue;
					}
					if (river[j+1].toString().equals("Bear")) {
						// Merge and create new bear instance to null
						for (int ctr = 0; ctr < river.length; ctr++) { // run once
							if (river[ctr] == null) {
								river[ctr] = new Bear();
								break;
							}
						}
						continue;
					} else if (river[j+1].toString().equals("Fish")) {
						// Eat the fish (it become null)
						river[j+1] = null;
						continue;
					} //else {
						
					//}
				} else if (river[j].toString().equals("Fish") && rNum != 0) {
					if (river[j+1] == null) {
						river[j+1] = new Fish();
						river[j] = null;
						continue;
					}
					if (river[j+1].toString().equals("Bear")) {
						// Fish is eaten
						river[j] = null;
						continue;
					} else if (river[j+1].toString().equals("Fish") && rNum != 0) {
						// Stay and create a new fish instance  to null
						for (int ctr = 0; ctr < river.length; ctr++) {
							if (river[ctr] == null) {
								river[ctr] = new Fish();
								break;
							}
						}
						continue;
					} //else {
						// Move to right and make the old position null
					//}
				}
			}
			
			for (int ctr = 0; ctr < river.length; ctr++) {
				if (river[ctr] != null) {
					System.out.print(river[ctr].toString() + " ");	
				} else {
					System.out.print("null" + " ");
				}
			}
			System.out.println();
		}

	}
}

class Animal {
	boolean state;
	public Animal() {
		state = true;
	}	
}

class Bear extends Animal {
	int sampleCount = 0;
	public Bear () {
		sampleCount = 1;
	}
	public String toString() {
		return "Bear";
	}
}

class Fish extends Animal {
	public Fish () {
		
	}
	
	public String toString() {
		return "Fish";
	}
}

