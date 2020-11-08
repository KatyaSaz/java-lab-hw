package hw.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import hw.game.GlobalConstants;
import hw.game.Model;

public class ModelTest {

	@Test
	public void ifInitialBorderSetWrong() {
		Model model = new Model();
		model.setInitialBorders(GlobalConstants.START_MAX_BORDER, GlobalConstants.START_MIN_BORDER);
		Assertions.assertEquals(GlobalConstants.START_MIN_BORDER, model.getMinBorder());
		Assertions.assertEquals(GlobalConstants.START_MAX_BORDER, model.getMaxBorder());
	}
	
	@Test
	public void isNumberGenerateIfBordersSetWrong() {
		Model model = new Model();
		model.setInitialBorders(GlobalConstants.START_MIN_BORDER, GlobalConstants.START_MAX_BORDER);
		Assertions.assertTrue(model.isNumberInDiaposone(
				model.generateRandomValue(
						GlobalConstants.START_MAX_BORDER, GlobalConstants.START_MIN_BORDER)));
	}
	
	@Test
	public void isNumberGeneratedInDiaposone() {
		Model model = new Model();
		model.setInitialBorders(GlobalConstants.START_MIN_BORDER, GlobalConstants.START_MAX_BORDER);
		int N = 100_000;
		int rand = 0;
		for (int i = 0; i < N; i++) {
			rand = model.generateRandomValue(GlobalConstants.START_MIN_BORDER, GlobalConstants.START_MAX_BORDER);
			Assertions.assertTrue(model.isNumberInDiaposone(rand));
		}
	}

	@Test
	public void isMethodNumberInDiaposoneWorkRight() {
		Model model = new Model();
		model.setInitialBorders(GlobalConstants.START_MIN_BORDER, GlobalConstants.START_MAX_BORDER);
		Assertions.assertFalse(model.isNumberInDiaposone(model.getMaxBorder() + 1));
		Assertions.assertFalse(model.isNumberInDiaposone(model.getMinBorder() - 1));
	}

	@Test
	public void isNumberWasGuessAndBordersChange() {
		Model model = new Model();
		model.setInitialBorders(GlobalConstants.START_MIN_BORDER, GlobalConstants.START_MAX_BORDER);
		int value = 35;
		int wrongValue = value + 3;
		int wrongValue2 = value - 2;
		int amountAttemptsMade = 3;
		model.setRandValue(value);
		
		Assertions.assertFalse(model.compareNumbers(wrongValue));
		Assertions.assertEquals(wrongValue, model.getMaxBorder());

		Assertions.assertFalse(model.compareNumbers(wrongValue2));
		Assertions.assertEquals(wrongValue2, model.getMinBorder());
		
		Assertions.assertTrue(model.compareNumbers(value));
		
		Assertions.assertEquals(amountAttemptsMade, model.getAttempts().size());
	}
}
	