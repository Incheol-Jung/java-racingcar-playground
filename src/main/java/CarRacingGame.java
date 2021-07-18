import java.util.Arrays;

public class CarRacingGame {
	private String[] cars;
	private int racingCount;

	public void setCars(String carNames) {
		cars = carNames.split(",");
		validateCarNames();
	}

	public String[] getCars() {
		return cars;
	}

	public void validateCarNames() {
		boolean isExistInvalidCar = Arrays.stream(cars).anyMatch(car -> car.length() > 5);
		if(isExistInvalidCar){
			throw new RuntimeException("5글자 이상으로 설정된 자동차 이름이 있습니다.");
		}
	}

	public void setRacingCount(int count) {
		this.racingCount = count;
	}

	public int getRacingCount() {
		return racingCount;
	}
}
