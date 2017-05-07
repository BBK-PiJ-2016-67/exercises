/**
 * A mobile phone that can make calls, ring alarms and play games
 */
public class MobilePhone extends OldPhone {
	private String[] calledNumbers;
	public MobilePhone(String brand) {
		super(brand);
		calledNumbers = new String[0];
	}
	/**
	 * Call a number and add it to a list of called numbers
	 *
	 * @param number the number to be called
	 */
	@Override
	public void call(String number) {
		super.call(number);
		this.saveNumber(number);
	}
	/**
	 * Save a number to call history
	 *
	 * @param number the number to be saved
	 */
	public void saveNumber(String number) {
		String[] newArr = new String[calledNumbers.length + 1];
		for (int i = 0; i < calledNumbers.length; i++) {
			newArr[i] = calledNumbers[i];
		}
		newArr[newArr.length - 1] = number;
		calledNumbers = newArr;
	}
	/**
	 * Play a game
	 *
	 * @param level the level to start at
	 */
	protected void playGame(String level) {
		System.out.println("Playing game at level " + level);
		return;
	}
	/**
	 * Prints the last ten called numbers
	 */
	public void printLastNumbers() {
		if (calledNumbers.length < 1) {
			return;
		}
		for (int i = 0; i < 10; i++) {
			if (i >= calledNumbers.length) {
				continue;
			}
			System.out.println(calledNumbers[calledNumbers.length - i - 1]);
		}
	}
	/**
	 * Ring an alarm
	 *
	 * @param time the time at which to ring the alarm
	 */
	public void ringAlarm(String time) {
		System.out.println("Ringing the alarm at " + time);
		return;
	}
}