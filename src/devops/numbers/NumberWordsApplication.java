package devops.numbers;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {	
//	private final NumberWords numberWords ;
//	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
//		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
//		while( true ) {
//			try {
//				System.out.print( "Enter number (0 to exit): " ) ;
//				String value = reader.readLine() ;
//				long number = Long.parseLong( value ) ;
				System.out.println("toWords 7 = " + NumberWords.toWords(7));
				System.out.println("toWords 76 = " + NumberWords.toWords(76));
				System.out.println("toWords 7748 = " + NumberWords.toWords(7748));
				System.out.println("toWords 6768845 = " + NumberWords.toWords(6768845));
				System.out.println("toWords 347 = " + NumberWords.toWords(347));
				System.out.println("toWords 67859 = " + NumberWords.toWords(67859));
				System.out.println("toWords 768686897 = " + NumberWords.toWords(768686897));
				System.out.println("toWords 3458792348 = " + NumberWords.toWords(Long.parseLong("3458792348")));
				
//			} catch ( NumberFormatException | IOException e ) {
//				System.out.println( "Invalid number" ) ;
//			}
//		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
