public class Launcher {
	
	public static void main(String[] args) {
		Spy spyOne = new Spy(1);
		Spy spyTwo = new Spy(2);

		spyOne.die();

		Spy spyThree = new Spy(3);

		spyTwo.die();
	}

}
