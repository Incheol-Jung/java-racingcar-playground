import java.util.Collection;

public class CarRacingGame {
	private String[] cars; 
	public void setCars(String carNames) {
		 cars = carNames.split(",");
	}

	public String[] getCars() {
		return cars;		
	}
}
