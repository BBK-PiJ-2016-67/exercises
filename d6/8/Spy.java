public class Spy {

	private int id;
	private static int spyCount = 0;

	public Spy(int id) {
		this.id = id;
		this.spyCount += 1;
		System.out.println("ID is " + this.id + " and the spy count is " + this.spyCount);
	}

	public void die() {
		this.spyCount -= 1;
		System.out.println("Spy " + this.id + " has been detected and eliminated");
	}

}
