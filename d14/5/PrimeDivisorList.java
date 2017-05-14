package impl;

import java.util.ArrayList;
import java.util.List;

public class PrimeDivisorList {

	private List<Integer> list;

	public PrimeDivisorList() {
		this.list = new ArrayList<Integer>();
	}

	public void add(Integer value) throws NullPointerException, IllegalArgumentException {
		if (value == null) {
			throw new NullPointerException("value cannot be null");
		}

		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				throw new IllegalArgumentException("value must be a prime");
			}
		}

		this.list.add(value);
	}

	public String toString() {
		String output = "";
		int sum = 0;
		for (Integer value : this.list) {
			if (sum == 0) {
				sum = value;
			} else {
				sum = sum * value;
			}
			output += value + " * ";
		}
		if (output.endsWith(" * ")) {
			output = output.substring(0, output.length() - 3);
		}
		return output == "" ? output : output + " = " + sum;
	}

}
