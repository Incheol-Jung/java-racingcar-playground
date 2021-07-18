import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.Test;

public class CarRacingGameTest {
	@Test
	void 경주할_자동차의_이름을_선정한다() {
		// given
		CarRacingGame carRacingGame = new CarRacingGame();

		// when
		carRacingGame.setCars("abc,qwe,dsa,qwe,cxz");

		// then
		assertThat(carRacingGame.getCars().length > 0).isTrue();
	}

	@Test
	void 자동차의_이름은_5자를_초과할_수_없다() {
		// given
		CarRacingGame carRacingGame = new CarRacingGame();

		// when
		assertThatThrownBy(() -> carRacingGame.setCars("abc,qwedsadsa,dsa,qwe,cxz")).isInstanceOf(
			RuntimeException.class);
	}
}
