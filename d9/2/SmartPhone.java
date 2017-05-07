/**
 * A smart phone that can do a whole bunch of stuff
 */
public class SmartPhone extends MobilePhone {
	public SmartPhone(String brand) {
		super(brand);
	}
	/**
	 * Call a number and add it to a list of called numbers
	 *
	 * @param number the number to be called
	 */
	@Override
	public void call(String number) {
		if (!number.startsWith("00")) {
			super.call(number);
			return;
		}
		System.out.println("Calling " + number + " through the internet to save money");
		this.saveNumber(number);
	}
	/**
	 * Browse the web
	 *
	 * @param url a url to browse
	 */
	public void browseWeb(String url) {
		System.out.println("Just browsin' " + url);
		return;
	}
	/**
	 * Get the user's GPS coordinates
	 */
	public Point findPosition() {
		return new Point(10, 20);
	}
	/**
	 * Play a game
	 *
	 * @param level the level to start at
	 */	
	public void playGame(String level) {		
		super.playGame(level);
	}
}