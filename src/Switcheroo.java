import java.io.Console;
import java.io.File;
import java.io.IOException;


public class Switcheroo {

	public static void main(String[] args) throws InterruptedException, IOException {

		Thread.sleep(1000);
		
		String latestName = args[0];
		String currentName = args[1];
		
		File current = new File(currentName);
		current.delete();
		System.out.println("Swapped");
		
		Runtime.getRuntime().exec("java -jar "+latestName);
		System.exit(0);
		
	}

}
