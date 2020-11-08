package hw.game;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private int randValue;
	private int minBorder;
	private int maxBorder;

	private List<Integer> attempts = new ArrayList<>();;

	// generate random value in range [start, end]
	public int generateRandomValue(int start, int end) {
		if (end < start) {
			int tmp = start;
			start = end;
			end = tmp;
		}
		return (int) (Math.random() * (end - start) + start);
	}

	// chooses what word must be added to output
	public String biggerOrLower(int value) {
		return ((value < randValue) ? GlobalConstants.BIGGER : GlobalConstants.LOWER);
	}

	// change value of borders
	public boolean compareNumbers(int value) {
		attempts.add(value);
		if (value == randValue) {
			return true;
		}
		if (value < randValue) {
			this.minBorder = value;
		} else {
			this.maxBorder = value;
		}
		return false;
	}

	// set initial value to min and max borders
	public void setInitialBorders(int min, int max) {
		if (max < min) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		this.minBorder = min;
		this.maxBorder = max;
	}

	public boolean isNumberInDiaposone(int value) {
		return (value >= minBorder) && (value < maxBorder);
	}

	public List<Integer> getAttempts() {
		return attempts;
	}

	public int getMinBorder() {
		return minBorder;
	}

	public void setMinBorder(int minBorder) {
		this.minBorder = minBorder;
	}

	public int getMaxBorder() {
		return maxBorder;
	}

	public void setMaxBorder(int maxBorder) {
		this.maxBorder = maxBorder;
	}

	public int getRandValue() {
		return randValue;
	}

	public void setRandValue(int randValue) {
		this.randValue = randValue;
	}

}
