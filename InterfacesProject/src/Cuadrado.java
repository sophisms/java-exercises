
public class Cuadrado implements FiguraGeometrica{
	private float lado;
	private String nombre;

	public Cuadrado(String nombre, float lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor

	public float getLado() {
		return lado;
	}//getLado

	public void setLado(float lado) {
		this.lado = lado;
	}//setLado
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float area() {
		return lado*lado; 
	}
	
	public float perimetro() {
		return lado*4;
	}
	
}//class Cuadrado
