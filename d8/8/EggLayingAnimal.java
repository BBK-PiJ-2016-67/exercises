public class Animal () {
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	public void call() {
		System.out.println(name + " coming...");
	}
}

public class AquaticAnimal extends Animal {
	@Override
	public void call() {
		System.out.println(name + " will not come...");
	}
}

public class FlyingAnimal extends Animal {
	@Override
	public void call() {
		System.out.println(name + " now flying, will come later when tired...");
	}
}

Animal bear = new Animal("bear");
Animal beetle = new Animal("beetle");
Animal cat = new Animal();
AquaticAnimal crocodile = new AquaticAnimal();
Animal dog = new Animal();
AquaticAnimal dolphin = new AquaticAnimal();
FlyingAnimal eagle = new FlyingAnimal();
FlyingAnimal fly = new FlyingAnimal();
AquaticAnimal frog = new AquaticAnimal();
Animal lizard = new Animal();
Animal monkey = new Animal();
FlyingAnimal pigeon = new FlyingAnimal();
AquaticAnimal salmon = new AquaticAnimal();
AquaticAnimal shark = new AquaticAnimal();
Animal snake = new Animal();
AquaticAnimal whale = new AquaticAnimal();