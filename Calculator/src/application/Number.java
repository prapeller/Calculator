package application;

public class Number {

	private String name;

	private String[] arabic = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
	private String[] roman = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };

	public Number(String name) {
		this.name = name;

	}

	public boolean isRoman() {
		for (int i = 0; i < roman.length; i++) {
			if (name.equals(roman[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean isArabic() {
		for (int i = 0; i < arabic.length; i++) {
			if (name.equals(arabic[i])) {
				return true;
			}
		}
		return false;
	}

	public int getIndex() {
		int ind = 0;
		for (int i = 0; i < arabic.length; i++) {
			if (name.equals(arabic[i])) {
				ind = i+1;
			}
		}
		for (int i = 0; i < roman.length; i++) {
			if (name.equals(roman[i])) {
				ind = i+1;
			}
		}
		return ind;
	}
}
