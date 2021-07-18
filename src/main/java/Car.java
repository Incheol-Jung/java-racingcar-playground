public class Car {
	public Car() {
		this.distance = 0;
		this.tryToGoTimes = 0;
	}

	private int distance;
	private int tryToGoTimes;

	public void tryToGo(int time) {
		increaseTryToGoTimes();
		boolean canGo = (time * Math.random() * 10) % 2 == 0;
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
}
