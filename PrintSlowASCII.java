package sample;

import java.util.Map;

public class PrintSlowASCII extends Thread {

	private String[] sArray;
	private Map<String, String[]> letters;
	private int temp=0;

	public PrintSlowASCII(String[] sArray, Map<String, String[]> letters,int temp) {
		super();
		this.sArray = sArray;
		this.letters = letters;
		this.temp = temp;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public Map<String, String[]> getLetters() {
		return letters;
	}

	public void setLetters(Map<String, String[]> letters) {
		this.letters = letters;
	}

	public String[] getsArray() {
		return sArray;
	}

	public void setsArray(String[] sArray) {
		this.sArray = sArray;
	}

	@Override
	public void run() {

		String[] s;
		for (int j = 0; j < sArray.length; j++) {
			s = letters.get(sArray[j]);
			if (s != null) {
				System.out.print(s[temp] + "  ");
			} else {
				System.out.print("   ");
			}

		}
		System.out.println();
		try {
			this.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
