/**
* An old phone that can only make calls
*/
public class OldPhone implements Phone {
	private String brand = null;
	public OldPhone(String brand) {
		this.brand = brand;
	}
	/**
	 * Returns the phone's brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * Call a number
	 *
	 * @param number the number to be called
	 */
	public void call(String number) {
		System.out.println("Calling " + number + "...");
	}
}