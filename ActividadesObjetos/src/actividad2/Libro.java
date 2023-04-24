package actividad2;

public class Libro {
	
	String titulo;
	String autor;
	int nejemplares;
	int ejemplaresp;
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(String titulo, String autor, int nejemplares, int ejemplaresp) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nejemplares = nejemplares;
		this.ejemplaresp = ejemplaresp;
	}
	
	boolean prestamo() {
		
		boolean prest = false;
		
		if (nejemplares > 0) {
			
			prest = true;
			ejemplaresp ++;
			nejemplares--;
		}
		
		
		return prest;
		
		
	}
	
	boolean devolucion() {
		
		boolean devol = false;
		
		if (ejemplaresp > 0) {
			devol = true;
			nejemplares--;
		}
		
		
		
		return devol;
		
	}
	
}
