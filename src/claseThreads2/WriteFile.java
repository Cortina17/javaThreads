package claseThreads2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		File file = new File("c://Ale//", "hola.txt");
		try {
			// ESTOY LEYENDO DESDE EL TECLADO
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			// IMPRIMIR
			PrintWriter out = new PrintWriter(new FileWriter(file));
			String s;
			System.out.print("Enter file text. ");
			System.out.println("[Type ctrl-d to stop.]");
			while ((s = in.readLine()) != null) {
				out.println(s); // println() escribe dentro del archivo
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
