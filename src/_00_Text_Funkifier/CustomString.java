package _00_Text_Funkifier;

public class CustomString extends SpecialString {

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String ts = ""+s.charAt(0);
		ts = ts.toUpperCase();
		
		String ts2 = s.substring(1);
		ts2 = ts2.toLowerCase();
		
		return ts+ts2;
	}

}
