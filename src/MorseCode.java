import java.util.*;
import java.io.*;

public class MorseCode {
	public static String alphabet[] ={ "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
		"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
		"w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
		"9", "0"};
	public static String morsecodes[] ={ ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
			"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
			"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--..", ".----", "..---", "...--", "....-", ".....",
			"-....", "--...", "---..", "----.", "-----"};
	public static Decoder x = new Decoder(alphabet,morsecodes);
	public static tobeDecoded n = new tobeDecoded();
	public static void main(String[] args)throws IOException {
		int runagain =0;
		do{
			String word = "";
			getUserInput();
			decode(n.getuserInput(),word);
			runagain=runagain(runagain);
		}while(runagain==1);	
	}
	public static void getUserInput()throws IOException {
		n.setuserInput();
	}
	public static void decode(String j,String word) {
		if(j.equals("")){
			System.out.println(word);
			return;
		}
		for(int i = 0;i<j.length();i++){
			String code = j.substring(0,i+1);
			String realletter = check(code);
			if(realletter.equals("")){
				break;
			}
			decode(j.substring(i+1,j.length()), word+realletter);
		}
	}
	public static String check(String i){
		String word = "";
		for(int j=0;j<x.getmorsecodeslength();j++){
			if(i.equals(x.getCode(j))){
				word = x.getLetter(j);
				
			}
		}
		return word;
	}
	public static int runagain(int x)throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 to runagain or 0 to quit");
		x = in.nextInt();
		
		if(x==1){
			return 1;
		}else{
			return 0;
		}
		
	}
	


}
