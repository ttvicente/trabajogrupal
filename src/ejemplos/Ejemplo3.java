package ejemplos;
import java.io.*;

// ESte es mi comentario para el primer cambio//

/* Proyecto ejemplo para controlar errores

Este ejemplo es una calculadora. Para ello se introducen
tres parametros: operacion, primer operando y segundo
operando. El resultado sera algo asi:
	
+ 7 8 daria 15

. 9 2 daria 18


Errores a controlar:
	
+ 7 Falta un parametro

/ 7 0 Runtime Exception

- Luis Jose No se puede convertir a entero   */

class Calculadora
{
	public static void main(String arg[]) throws IOException
	{

		
    /* a diferencia de C++, los parametros si deben aparecer en la
    declaracion de metodo main, el nombre del programa no forma parte de
    los argumentos que se pasan al programa, el siguiente bucle imprime
    la lista de argumentos que se pasan al programa  */

    	for( int i = 0; i < arg.length; i++)
       	System.out.println(arg[i]);

    	System.out.println("\n Tratamiento de Excepcines");
		try
		{

			switch (arg[0].charAt(0))
			{
				case '+':
					System.out.println ("Suma "+arg[1]+" y "+arg[2]+"\n");
					System.out.println ("Resultado= "+(Integer.parseInt
						(arg[1])+Integer.parseInt(arg[2])));
					break;
				case '-':
					System.out.println ("Resta "+arg[1]+" y "+arg[2]+"\n");
					System.out.println ("Resultado= "+(Integer.parseInt
						(arg[1])-Integer.parseInt(arg[2])));
					break;
				case '.':
					System.out.println ("Multiplica "+arg[1]+" y "+arg[2]+"\n");
					System.out.println ("Resultado= "+(Integer.parseInt
						(arg[1])*Integer.parseInt(arg[2])));
					break;
				case '/':
					System.out.println ("Divide "+arg[1]+" y "+arg[2]+"\n");
					System.out.println ("Resultado= "+(Integer.parseInt
						(arg[1])/Integer.parseInt(arg[2])));
					break;
			} // switch

		} // try

		// Errores no verificables que se van a controlar

		catch(ArrayIndexOutOfBoundsException error)
			{
                System.out.println("\n Desbordamiento ");
			}
		catch(ArithmeticException error)
			{
				System.out.println("No se puede dividir por cero");
			}
		catch(NumberFormatException error)
			{
				System.out.println("Los parametros deben ser enteros");
			}

		finally // Siempre se va a ejecutar
			{
				System.out.println("Adios");
			}

    	char a =(char) System.in.read() ;

	} // main
} // class