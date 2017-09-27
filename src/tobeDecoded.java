import java.io.*;
import java.util.*;
public class tobeDecoded{
	public String userInput;
	public tobeDecoded() {
		
	}
	public tobeDecoded(String userInput) {
		this.userInput=userInput;
	}
	public String getInput()throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the morse code signal: ");
		String i =in.nextLine();
		return i;
	}
	public void setuserInput()throws IOException {
		userInput=getInput();
	}
	public String getuserInput(){
		return userInput;
	}
}
