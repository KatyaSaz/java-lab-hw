package hw.game;

public class Model {

	private int randValue;
	private int minBorder;
	private int maxBorder;
	
	public Model() {
	
	}
	
	//generate random value in range [start, end]
	public int generateRandomValue(int start, int end) {
		return (int) (Math.random() * (end - start + 1) + start);
	}

	// if input < rand - true 
	// if input > rand- false
	public boolean compareNumbers(int value) {
		if(value<randValue) {
			this.minBorder = value;
			return true;
		}else {
			this.maxBorder = value;
			return false;
		}
	}
	
	//chooses what word must be added to output
	public String biggerOrLower(int inputValue) {
		return (compareNumbers(inputValue) ? GlobalConstants.BIGGER : GlobalConstants.LOWER);
	}
	
	
	public void setInitialBorders(int min, int max) {
		this.minBorder = min;
		this.maxBorder = max;
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
