package excepciones;

import java.io.IOException;

public class Ejemplo2Bien 
{

	public static void main(String[] args)
	{
       //Funcion que de una respuesta
		char respuesta = getRespuesta();
		System.out.println("Fin de programa :) ");
	}

	public static char getRespuesta()
	{
		//Necesito una variable para almacenar la respuesta
		char respuesta = 'a';
		do
		{
			System.out.println("¿Desea continuar? Responda 's' o 'n'");
			try 
			{
			    respuesta = (char)System.in.read();
			    respuesta = Character.toLowerCase(respuesta);
				//Limpiamos el buffer
				System.in.skip(2);
				//Comprobamos que la respuesta sea valida
				if(respuesta !='n' && respuesta !='s')
				{
					System.out.println("Error, respuesta no válida. Teclee una s o una n");
				}
			}
			catch(IOException error)
			{
				System.err.println("Error de entrada y salida: " + error.getMessage());
			
			}
		}while (respuesta !='n' && respuesta!='s');
		return respuesta;
		
	}

}
