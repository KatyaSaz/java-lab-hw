package hw.hello;

public class Model {

	private String firstWord;
	private String secondWord;

	public String concatenateWordsInSentance() {
		return firstWord + " " + secondWord+"!";
	}

	public String getFirstWord() {
		return firstWord;
	}

	public void setFirstWord(String firstWord) {
		this.firstWord = firstWord;
	}

	public String getSecondWord() {
		return secondWord;
	}

	public void setSecondWord(String secondWord) {
		this.secondWord = secondWord;
	}
	
}
