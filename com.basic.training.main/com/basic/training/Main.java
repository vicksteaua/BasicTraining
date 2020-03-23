import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String str1="ab";
		//AcceptString a=new AcceptString(str);
		//System.out.println(a.getStr());
		//a.acceptConsole();
		//a.acceptFile();
		//a.acceptGUI();
		
		StringOperations b=new StringOperations();
		System.out.println(b.countStringChars(str1));
		System.out.println(b.revertStringChars(str1));
		System.out.println(b.addStringChars(str1, "tt1",1));
		System.out.println(b.reduceStringChars(str1, 0, 1));

	}

}
