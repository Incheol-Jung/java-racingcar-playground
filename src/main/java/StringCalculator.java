import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static final String DEFULAT_SEPERATOR = ",";
	private String content;
	private int[] numbers;

	public void setContents(String content) {
		this.content = content;
	}

	public void separate() {
		String separateWord = getSeperateWord();
		String filteredContents = filterContents(separateWord);
		String[] strings = filteredContents.split(separateWord);
		numbers = new int[strings.length];
		for (int index = 0; index < strings.length; index++) {
			try {
				numbers[index] = Integer.parseInt(strings[index]);
			} catch (NumberFormatException ex) {
				throw new RuntimeException(ex.getMessage());
			}
		}
	}

	private String filterContents(String separateWord) {
		String result = this.content;
		if (!separateWord.equals(DEFULAT_SEPERATOR)) {
			int index = this.content.indexOf("\n");
			result = this.content.substring(index + 1);
		}
		return result;
	}

	private String getSeperateWord() {
		String word = ",";
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(this.content);
		if (m.find()) {
			word = m.group(1);
		}

		return word;
	}

	public int[] getNumbers() {
		return this.numbers;
	}

	public int getTotalValue() {
		return Arrays.stream(this.numbers).sum();
	}
}
