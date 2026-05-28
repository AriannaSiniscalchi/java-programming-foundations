package eccezioni;

import java.io.FileInputStream;
import java.io.IOException;

public class Lettore {

	public void printFileContent(FileInputStream fileInputStream) {
		byte[] buffer = new byte [1024];
		try {
			while(fileInputStream.read(buffer) > 0) {
				System.out.println(buffer);
			}
		}catch(IOException e) {
			System.out.println("Error reading file content");
			e.printStackTrace();
		}
		finally {
			try {
				fileInputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
