package ejemplos;

import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args)throws IOException {
		// Funcion y respuesta
		char respuesta = getRespuesta();
		System.out.println("Fin del programa");

	}
	public static char getRespuesta()throws IOException {
		//Variables
		char respuesta;
		do {
			System.out.println("Quieres seguir 's' o 'n'");
			respuesta = (char) System.in.read();
			//Limpiamos el buffer
			System.in.skip(2);
			//Comprobamos que la respuesta sea valida
			if(respuesta != 's' && respuesta != 'n') {
				System.err.println("Error, respuesta no valida");
			}
				
		}while(respuesta != 's' && respuesta != 'n');
		return respuesta;
		
	}
}
