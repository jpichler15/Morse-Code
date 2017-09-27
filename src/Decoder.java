import java.io.*;
import java.util.*;
public class Decoder {
	public String[]alphabet;
	public String[]morsecodes;
	public Decoder(String[]alphabet,String[]morsecodes) {	
		this.alphabet=alphabet;
		this.morsecodes=morsecodes;
		
	}
	public String[] getAlphabet() {
		return alphabet;
	}
	public String[] getmorsecodes() {
		return morsecodes;
	}
	public String getLetter(int i) {
		return alphabet[i];
	}
	public String getCode(int i) {
		return morsecodes[i];
	}
	public int getmorsecodeslength() {
		return morsecodes.length;
	}
	
}
