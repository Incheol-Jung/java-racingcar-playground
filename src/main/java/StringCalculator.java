public class StringCalculator {
	private String content;
	private String[] numbers;

	public void setContents(String content) {
		this.content = content;
	}

	public void separate() {
		numbers = this.content.split(",");
	}

	public String[] getNumbers() {
		return this.numbers;
	}
}
