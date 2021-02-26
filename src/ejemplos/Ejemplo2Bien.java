package ejemplos;

import java.io.IOException;

public class Ejemplo2Bien {


	public static void main(String[] args){
		// Funcion y respuesta
		char respuesta = getRespuesta();
		System.out.println("Fin del programa");

	}
	public static char getRespuesta() {
		//Variables
		char respuesta = 'a';
		System.out.println("Quieres seguir 's' o 'n'");
		do {
			try {
				respuesta = (char) System.in.read();
				respuesta = Character.toLowerCase(respuesta);
				//Limpiamos el buffer
				System.in.skip(2);
				//Comprobamos que la respuesta sea valida
				if(respuesta != 's' && respuesta != 'n') {
					System.err.println("Error, respuesta no valida, teclea 'n' o 's' ");
			}}
			catch(IOException Error) {
				System.err.println("Error entrada y salida: " + " " + Error.getMessage());
			}
			
			
			
				
		}while(respuesta != 's' && respuesta != 'n');
		return respuesta;
		
	}

}
