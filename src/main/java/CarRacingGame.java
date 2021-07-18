import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarRacingGame {
	private List<Car> cars = new ArrayList<>();
	private int racingCount;

	public void setCars(String names) {
		String[] carNames = names.split(",");
		validateCarNames(carNames);
		for (String carName : carNames) {
			cars.add(new Car(carName));
		}
		
	}

	public List<Car> getCars() {
		return cars;
	}

	public void validateCarNames(String[] carNames) {
		boolean isExistInvalidCar = Arrays.stream(carNames).anyMatch(car -> car.length() > 5);
		if (isExistInvalidCar) {
			throw new RuntimeException("5글자 이상으로 설정된 자동차 이름이 있습니다.");
		}
	}

	public void setRacingCount(int count) {
		this.racingCount = count;
	}

	public int getRacingCount() {
		return racingCount;
	}

	public String print() {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < racingCount; i++) {
			stringBuffer.append(this.setCurrentRacingStatus());
			stringBuffer.append("");
		}
		System.out.println(stringBuffer.toString());
		return stringBuffer.toString();
	}

	private String setCurrentRacingStatus() {
		StringBuffer stringBuffer = new StringBuffer();
		for (Car car : getCars()) {
			car.tryToGo();
			stringBuffer.append(car.print() + "\n");
		}
		stringBuffer.append("\n");
		
		return stringBuffer.toString();
	}
}
