package excepciones;

import java.io.IOException;

public class Ejemplo2 
{

	public static void main(String[] args) throws IOException 
	{
       //Funcion que de una respuesta
		char respuesta = getRespuesta();
		System.out.println("Fin de programa :) ");
	}

	public static char getRespuesta() throws IOException 
	{
		//Necesito una variable para almacenar la respuesta
		char respuesta;
		do
		{
			System.out.println("¿Desea continuar? Responda 's' o 'n'");
			respuesta = (char)System.in.read();
			//Limpiamos el buffer
			System.in.skip(2);
			//Comprobamos que la respuesta sea valida
			if(respuesta !='n' && respuesta !='s')
			{
				System.out.println("Error, respuesta no válida. Teclee una s o una n");
			}
		}while (respuesta !='n' && respuesta!='s');
		return respuesta;
		
	}

}
