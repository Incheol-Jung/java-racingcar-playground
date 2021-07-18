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
}
