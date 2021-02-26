package ejemplos;

public class acumuladores {

	public static void main(String[] args) 
	{
	   //Inicializamos los acumuladores
		int suma = 0;
		int producto = 1;
		//Hacemos la suma y el producto
		for (int i =1; i<= 5; i++)
		{
           suma = suma + 1;
           producto = producto * i;
	    }
		//Imprimir resultados
		System.out.print("SUMA= " + suma);
		System.out.print("PRODUCTO= " + producto);
	}	

}
