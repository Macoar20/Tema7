package actividad3;

public class Punto {

	int x;
	int y;
	


	public Punto(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	void imprime() {
		
		System.out.println("("+x+","+y+")");
		
	}
	
	void setXY(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	void desplaza(int dx, int dy) {
		
		x += dx;
		y += dy;
		
	}
	
	int distancia(Punto p) {
		
		int distanc;
		
		distanc= (int)(Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y)));
		
		return distanc;
		
	}
	
}
