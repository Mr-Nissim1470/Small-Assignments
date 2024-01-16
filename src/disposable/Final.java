
package disposable;

import java.util.*;
import java.io.*;

public class Final {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File Reading = new File("______.txt");
		
		if(!Reading.exists()) {
			System.out.println("File not found");
		}
		
		Scanner Reader = new Scanner(Reading);
		
		File Writer = new File("OUTPUT");
		
		PrintWriter Quill = new PrintWriter(Writer);
		
		while (Reader.hasNext()) {
			
			//commands 
			
		}
		Reader.close();
		Quill.close();
		
	}

}
