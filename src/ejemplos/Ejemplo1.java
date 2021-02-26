package ejemplos;

public class Ejemplo1 {

	public static void main(String[] args) {
		//Declaramos e instanciamos un Array
		
		/**
		 * El código donde se puede producir el error lo vamos a encerrar
		 * dentro de una estructura try catch
		 */
		try {
			double array[] = new double[1000000000];
		}catch(OutOfMemoryError Error) {
			System.err.println("Error, memoria insuficiente");
		}
		
	}

}
