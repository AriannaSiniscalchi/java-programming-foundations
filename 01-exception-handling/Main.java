package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, FrazioneNonCorrettaException {
		
		int[] myarray = new int[10];
		
		for(int i = 0; i < 10; i ++) {
			//qualche cosa
			myarray[i] = 0;
		}
		
		int i = 0;
		try {
			while(true) {
				myarray[i] = 0;
				i++;
			}
		}
		catch(IndexOutOfBoundsException e) {
			
		}
		
		
		try {
			metodo();
		}
		catch(ArithmeticException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void metodo() throws ArithmeticException, FileNotFoundException, FrazioneNonCorrettaException{
		
		Scanner sc = new Scanner(new File("pippo.txt"));
		
		//trow new FileNotFoundException("uscite dall'indice");
		int a = 9;
		int b = sc.nextInt();
		
		if(b == 0) {
			throw new FrazioneNonCorrettaException (a, b);
		}
		int c = a / b; //eccezione non controllata, estende RunTimeException
		
	}
}
