package hw.task1.game;

public class Model {

	private int value;

	// if input < rand - true 
	// if input > rand- false
	public boolean compareNumbers(int rand) {
		return (value < rand);
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

}
