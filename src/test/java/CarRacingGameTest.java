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
		assertThat(carRacingGame.getCars().size() > 0).isTrue();
	}

	@Test
	void 자동차의_이름은_5자를_초과할_수_없다() {
		// given
		CarRacingGame carRacingGame = new CarRacingGame();

		// when
		assertThatThrownBy(() -> carRacingGame.setCars("abc,qwedsadsa,dsa,qwe,cxz")).isInstanceOf(
			RuntimeException.class);
	}

	@Test
	void 자동차를_이동할_시도_횟수를_설정한다() {
		// given
		CarRacingGame carRacingGame = new CarRacingGame();

		// when
		carRacingGame.setCars("abc,qwe,dsa,qwe,cxz");
		carRacingGame.setRacingCount(5);

		// then
		assertThat(carRacingGame.getRacingCount()).isEqualTo(5);
	}

	@Test
	void 자동차를_움직이게_한다() {
		// given
		Car car = new Car("speed car");

		// when
		car.tryToGo();

		// then
		assertThat(car.getTryToGoTimes()).isEqualTo(1);
	}

	@Test
	void 총_설정한_횟수_만큼_움직일수_있는_기회가_있다() {
		// given
		Car car = new Car("speed car");

		// when
		car.tryToGo();
		car.tryToGo();
		car.tryToGo();

		// then
		assertThat(car.getTryToGoTimes()).isEqualTo(3);
	}

	@Test
	void 각각의_자동차는_랜덤으로_움직이게_된다() {
		// given
		Car car1 = new Car("car1");
		Car car2 = new Car("car2");

		// when
		for (int i = 0; i < 5; i++) {
			car1.tryToGo();
			car2.tryToGo();
		}

		// then
		assertThat(car1.getTryToGoTimes()).isEqualTo(car2.getTryToGoTimes());
	}

	@Test
	void 움직이는_거리는_표시되어야_한다() {
		// given
		CarRacingGame carRacingGame = new CarRacingGame();

		// when
		carRacingGame.setCars("aaa,bbb,ccc,ddd,eee");
		carRacingGame.setRacingCount(5);
		
		// then
		assertThat(carRacingGame.print().isEmpty()).isFalse();
	}
}
