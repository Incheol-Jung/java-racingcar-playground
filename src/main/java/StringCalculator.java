public class StringCalculator {
	private String content;
	private int[] numbers;

	public void setContents(String content) {
		this.content = content;
	}

	public void separate() {
		String[] strings = this.content.split(",");
		numbers = new int[strings.length];
		for (int index = 0; index < strings.length; index++) {
			try {
				numbers[index] = Integer.parseInt(strings[index]);
			} catch (NumberFormatException ex) {
				throw new RuntimeException(ex.getMessage());
			}
		}
	}

	public int[] getNumbers() {
		return this.numbers;
	}
}
