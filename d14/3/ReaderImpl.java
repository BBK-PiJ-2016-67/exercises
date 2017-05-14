package impl;

import java.util.Scanner;
import spec.Reader;

public class ReaderImpl implements Reader {

	private Scanner scanner;

	public static void main(String[] args) {
		Reader reader = new ReaderImpl();
		reader.run();
	}

	private int prompt(String message) {
		System.out.print(message);
		String input = this.scanner.next();
		try {
			return Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("That was not a number!");
			return -1;
		}
	}

	public void run() {
		this.scanner = new Scanner(System.in);
		int max = 0;
		while (max == 0) {
			int input = this.prompt("How many numbers would you like to enter? ");
			if (input == -1) {
				continue;
			}
			max = input;
		}
		int count = 0;
		int total = 0;
		while (count != max) {
			int input = this.prompt("Enter a number: ");
			if (input == -1) {
				continue;
			}
			total += input;
			count += 1;
		}
		System.out.println("The mean average is: " + total / max);
	}

}
