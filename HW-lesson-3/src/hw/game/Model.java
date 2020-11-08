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
		return (int) (Math.random() * (end - start + 1) + start);
	}

	// chooses what word must be added to output
	public String biggerOrLower(int inputValue) {
		return (compareNumbers(inputValue) ? GlobalConstants.BIGGER : GlobalConstants.LOWER);
	}

	// change value of borders
	// if input < rand - true
	// if input > rand- false
	public boolean compareNumbers(int value) {
		if (value < randValue) {
			this.minBorder = value;
			return true;
		} else {
			this.maxBorder = value;
			return false;
		}
	}

	// set initial value to min and max borders
	public void setInitialBorders(int min, int max) {
		this.minBorder = min;
		this.maxBorder = max;
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
