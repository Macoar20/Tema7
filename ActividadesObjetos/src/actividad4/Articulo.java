package actividad4;

public class Articulo {

	
	String nombre;
	int precio;
	final int iva = 21;
	int cuantosQuedan;
	
	public Articulo(String nombre, int precio, int cuantosQuedan) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	void imprimir() {
		
		System.out.println(nombre+":"+precio+"euros, y nos quedan"+ cuantosQuedan);
		
	}
	
}
