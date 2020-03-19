import java.util.Scanner;

public class AcceptString {
	private String str;
	
	public AcceptString(String str)
	{
		this.str=str;
	}
	
	public String getStr() {
		return str.toString();
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void acceptConsole() {
		Scanner in = new Scanner (System.in);
		String str=in.nextLine();
		System.out.println("You entered string "+str);
	}
	

}
