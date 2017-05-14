package impl;

import java.util.Scanner;
import spec.Reader;

public class ReaderImpl implements Reader {

	private Scanner scanner;

	public static void main(String[] args) {
		Reader reader = new ReaderImpl();
		reader.run();
	}

	public void run() {
		this.scanner = new Scanner(System.in);
		System.out.print("Enter the patient's name: ");
		String name = this.scanner.next();
		System.out.print("Enter the patient's age: ");
		String input = this.scanner.next();
		try {
			int age = Integer.parseInt(input);
			if (age < 0 || age > 130) {
				throw new IllegalArgumentException("Invalid age.");
			}
			Patient patient = new Patient(age, name);
			System.out.println("Patient age is: " + patient.getAge());
			System.out.println("Patient name is: " + patient.getName());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
