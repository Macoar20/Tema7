package actividad1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int dinero;
		
		CuentaCorriente Cuenta = new CuentaCorriente();
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, sexo, Dni y saldo");
		Cuenta.nombre = ma.nextLine();
		Cuenta.Sexo = ma.nextLine();
		Cuenta.DNI = ma.nextLine();
		Cuenta.saldo = ma.nextInt();
		
		Cuenta.mostrarInfo();
		
		System.out.println("Con cuanto dinero vas a ingresar?");
		
		dinero = ma.nextInt();
		
		Cuenta.ingresarDinero(dinero);
		
		System.out.println("Cuanto dinero quieres sacar?");
		
		dinero = ma.nextInt();
		
		Cuenta.sacarDinero(dinero);
		

	}

}
