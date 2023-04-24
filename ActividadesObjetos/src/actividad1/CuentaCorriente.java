package actividad1;

public class CuentaCorriente {
	
	String nombre;
	
	int saldo;
	
	String DNI;
	
	String Sexo;
	
	void DniNombre(String dni, String Nombre) {
		
		this.DNI = dni;
		this.nombre = Nombre;
		
		
	}
	
	void DniNombreSaldo(String dni, String Nombre, int Saldo, String sexo) {
		
		this.DNI = dni;
		this.nombre = Nombre;
		this.saldo = Saldo;
		this.Sexo = sexo;
		
	}
	
	void sacarDinero(int dinero) {
		
		if (saldo>dinero) {
			
			saldo -= dinero;
			
		} else {
			System.out.println("No tiene suficiente dinero para realizar la operación.");
		}
		
	}
	
	void ingresarDinero(int dinero) {
		
		saldo += dinero;
		
	}
	
	void mostrarInfo() {
		
		System.out.println("El saldo correspondiente al DNI "+ DNI +" de sexo "+ Sexo +" es igual a: "+ saldo);
		
	} 
	
	enum Sexo {
		
		Femenino, Masculino
		
	}

}
