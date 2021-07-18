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
}
