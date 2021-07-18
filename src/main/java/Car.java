public class Car {
	private String carName;

	public Car(String carName) {
		this.distance = 0;
		this.tryToGoTimes = 0;
		this.carName = carName;
	}

	private int distance;
	private int tryToGoTimes;

	public void tryToGo() {
		increaseTryToGoTimes();
		boolean canGo = (int)((Math.random() * 10) % 2) == 0;
		if (canGo) {
			increaseDistance();
		}
	}

	private void increaseTryToGoTimes() {
		tryToGoTimes++;
	}

	private void increaseDistance() {
		distance++;
	}

	public int getTryToGoTimes() {
		return tryToGoTimes;
	}

	public String print() {
		return carName + " : " + getDistance();
	}

	private String getDistance() {
		StringBuffer distanceString = new StringBuffer();
		for (int i = 0; i < distance; i++) {
			distanceString.append("-");
		}
		return distanceString.toString();
	}
}
