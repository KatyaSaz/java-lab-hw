package hw.task1.game;

public class Model {

	private int value;
	private int min = 0;
	private int max = 100;

	// if input < rand - true 
	// if input > rand- false
	public boolean compareNumbers(int rand) {
		if(value<rand) {
			this.min = value;
			return true;
		}else {
			this.max = value;
			return false;
		}
	}
	
	public boolean isEqual(int rand) {
		return (value==rand);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	

}
