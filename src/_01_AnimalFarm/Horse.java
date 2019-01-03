package _01_AnimalFarm;

public class Horse extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("neigh");
	}

	@Override
	public void eat() {
		System.out.println("Horse ate apple");
	}

}
