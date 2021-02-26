package excepciones;

public class Ejemplo1 
{
   public static void main(String [] args)
   {
	   // Declaramos e instanciamos un array
	   /*El codigo donde se puede producir el error lo metemos
	    * dentro de una estructura try catch */
	   try{
		   double array [] = new double [1000000000];
	   }
	   catch(OutOfMemoryError error)
	   {
		   System.err.println("Error, memoria insuficiente");
	   }
   }
}
