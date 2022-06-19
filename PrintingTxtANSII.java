package sample;

import java.util.Map;


public class PrintingTxtANSII {

	private String string;
	private Alphabet eng = new Alphabet(null);

	public PrintingTxtANSII(String string, Alphabet eng) {
		super();
		this.string = string;
		this.eng = eng;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Alphabet getEng() {
		return eng;
	}

	public void setEng(Alphabet eng) {
		this.eng = eng;
	}

	public void printANSII() {

		String[] s;
		String[] sArray = string.toLowerCase().split("");

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < sArray.length; j++) {
				s = eng.getLetters().get(sArray[j]);
				if (s != null) {
					System.out.print(s[i] + "  ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}

	}
	
	
	public void printANSIISlow() {
		String[] sArray = string.toLowerCase().split("");
		
	
		for (int i = 0; i < 7; i++) {
			int temp=i;
			PrintSlowASCII prslow= new PrintSlowASCII(sArray, eng.getLetters(),temp);
			prslow.run();
			
			
		}
		
		
	}

}
