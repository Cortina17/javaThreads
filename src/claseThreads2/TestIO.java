package claseThreads2;

import java.io.*;
import java.util.*;

public class TestIO {

	public static void main(String[] args) {
		int cant = 0;
		int anio = 0;
		int ahora = Calendar.getInstance().get(Calendar.YEAR);

		String buf;
		FileReader fs = null;
		try {
			fs = new FileReader("C:\\Users\\dcortina\\Desktop\\Datos.csv"); // File == "c://Ale//Datos.csv"
		} catch (Exception e) {
			System.out.println("No es posible abrir Datos.csv");
			System.exit(1);
		}
		List list = new ArrayList();
		BufferedReader ds = new BufferedReader(fs);
		while (true) { // se posiciona en cada fila
			try {
				buf = ds.readLine();
				if (buf == null)
					break;
			} catch (IOException e) {
				System.out.println("Error en lectura de archivo.");
				break;
			}
			StringTokenizer st = new StringTokenizer(buf, ";");
			System.out.println("tokens: " + st.countTokens());
			String name = null;
			while (st.hasMoreTokens()) { // se mueve por cada columna
				name = st.nextToken().toString();
				System.out.print(name + " ");
				cant++;
				if (cant == 4) {
					anio = Integer.parseInt(name);
					int cuenta = ahora - anio;
					System.out.println("Tiene: " + cuenta);
				}
			}
			System.out.println("\n");
			cant = 0;
			list.add(buf);
		}
		try {
			fs.close();
		} catch (IOException e) {
			System.out.println("Error detectado en cierre de archivo.");
		}

	}

}
