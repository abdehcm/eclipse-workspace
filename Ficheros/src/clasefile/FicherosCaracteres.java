package clasefile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FicherosCaracteres {

	
 

	public static void escribirLinea(File f, String linea) {

		try {
			// 1. Abrir:
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			// 2. Operar:
			pw.write(linea);

			// 3. Cerrar:
			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void leer(File f) {

		try {
			// 1. Abrir:
			FileReader fr = new FileReader(f);
			
			// 2. Operar:
			int car = fr.read();
			while (car!= 1) {
				
			}
			
			// 3. Cerrar:
			//fw.flush();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
