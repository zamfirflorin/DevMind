package com.junior.Generics.DeepOceanBlue;

public class AquariumManager {

	public static void main(String[] args) {
		Shark shark = new Shark("Jow");
		Tuna tuna = new Tuna("Waty");
		Dolphin dolphin = new Dolphin("Dora");

		Aquarium aquarium1 = new Aquarium("Deep oceans blue");
		aquarium1.addFish(shark);
		aquarium1.addFish(tuna);
		aquarium1.addFish(dolphin);

		System.out.println(aquarium1.numberOfFishes());

		// Problem: fishes are not compatible!
		// Solution: One aquarium should hold only one species
		// Options:
		// I. Could define for each type of fish a type of aquarium (i.e. child-class)
		// -> problems: duplicate code,
		// child-classes are useful when extra or specific functionality
		// is required (not the case here - classes would have identic code)
		// II. Using generics!
	}
}
