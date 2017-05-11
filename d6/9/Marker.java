import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marker {

	List<Integer> marks = new ArrayList<Integer>();
	Scanner reader = new Scanner(System.in);

	public Marker() {
		int input = 0;
		while(input != -1) {
			System.out.print("Input a mark: ");
			input = reader.nextInt();
			if (input != -1) {
				marks.add(input);
			}
		}
		int distinctions = 0;
		int passes = 0;
		int fails = 0;
		int invalid = 0;
		for (Integer i : marks) {
			if (i < 0 || i > 100) {
				invalid += 1;
				continue;
			}
			if (i >= 70) {
				distinctions += 1;
			} else if (i >= 50) {
				passes += 1;
			} else {
				fails += 1;
			}
		}
		System.out.println("There are " + marks.size() + " students: " + distinctions + " distinctions, " + passes + " passes , " + fails + " fails (plus " + invalid + " invalid).");
	}
	
	public static void main(String[] args) {
		Marker marker = new Marker();
	}

}
