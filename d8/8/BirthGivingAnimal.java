/**
 * An animal
 */
public abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	/**
	 * Call out the animal's name
	 */
	public void call() {
		System.out.println(name + " coming...");
	}
	/**
	 * Reproduce
	 */
	public void reproduce() {
		System.out.println(name + " reproducing...");
	}
	/**
	 * Make the sound of the animal
	 */
	public void makeSound();
}