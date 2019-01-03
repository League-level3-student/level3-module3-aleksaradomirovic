package _01_AnimalFarm;

public class Pig extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("oink");
	}

	@Override
	public void eat() {
		System.out.println("Pig ate carrot");
	}
}
