package clasefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FlujoCaracteres2 {

	public static void main(String[] args) {

		// Nombre del archivo donde se escribirá el texto
		String nf = "hola_mundo.txt";

		// Contenido que se escribirá en el archivo
		String contenido = "Hola mundo";

		try {
			// Crear un FileWriter en modo append (agregar), para no sobrescribir el archivo
			FileWriter fw = new FileWriter(nf, true);

			// Crear un BufferedWriter para mejorar el rendimiento de escritura
			BufferedWriter br = new BufferedWriter(fw);

			// Escribir el contenido en el archivo
			br.write(contenido);

			// Añadir un salto de línea para separar los escritos
			br.newLine();

			// Cerrar el buffer y el escritor
			br.close();

			System.out.println("Se ha añadido 'Hola mundo' al archivo " + nf);

		} catch (IOException e) {
			System.out.println("Ocurrió un error al escribir en el archivo.");
			e.printStackTrace();
		}
	}
}
