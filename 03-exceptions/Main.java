package eccezioni;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.util.Random;

public class Main {

	/*private static void f() throws Throwable{
		System.out.println("Throw new exception f()");
		if(new Random().nextBoolean()) {
			throw new MyExceptionNonControllata("Generated in f()");
		}
		else
			throw new Throwable("Generated in f()");
	}
	private static void g() throws Exception{ 
		try {
			f();
		}
		catch(MyException e) {
			System.out.println("Exception catched MyException in g(). Rethrow");
			throw new Exception("Generated in g()", new Throwable(e));
		}
		catch(Throwable e) {
			System.out.println("Exception catched in g(). Rethrow");
			throw new Exception("Generated in g()", new Throwable(e));
			//throw new Exception("Generated in g()", new Throwable("Generated in f()"));
		}
		finally {
			System.out.println("Eseguo il finally");
		}
	}
	public static void main(String[] args) {
		try {
			g();
		}catch(Exception e) {
			System.out.println("Exception catched in main()");
			System.out.println(e.getMessage());
		}
	}*/
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream r = new FileInputStream(new File("pippo.txt")); //lettura di un file
		
		Lettore l = new Lettore();
		l.printFileContent(r);;
	}
}
