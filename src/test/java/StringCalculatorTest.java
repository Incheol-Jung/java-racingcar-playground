import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	@Test
	void 문자열을_콤마_로_구분짓는다() {
		// given
		StringCalculator stringCalculator = new StringCalculator();

		// when
		stringCalculator.setContents("1,2,3,4,5");
		stringCalculator.separate();

		// then
		assertThat(stringCalculator.getNumbers().length > 0).isTrue();
	}

	@Test
	void 구분지은_값이_숫자인지_확인한다() {
		// given
		StringCalculator stringCalculator = new StringCalculator();

		// when
		stringCalculator.setContents("1,2,3,4,d");
		assertThatThrownBy(() -> stringCalculator.separate()).isInstanceOf(RuntimeException.class);
	}

	@Test
	void 각_숫자의_합을_구한다() {
		// given
		StringCalculator stringCalculator = new StringCalculator();

		// when
		stringCalculator.setContents("1,2,3");
		stringCalculator.separate();

		// then
		assertThat(stringCalculator.getTotalValue()).isEqualTo(6);
	}

	@Test
	void 커스텀_구분자가_있는지_확인한다() {
		// given
		StringCalculator stringCalculator = new StringCalculator();

		// when
		stringCalculator.setContents("//;\n1;2;3");
		stringCalculator.separate();

		// then
		assertThat(stringCalculator.getTotalValue()).isEqualTo(6);
	}
}
