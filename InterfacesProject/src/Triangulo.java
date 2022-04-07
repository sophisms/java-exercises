
public class Triangulo implements FiguraGeometrica{
	private float base;
	private float altura;
	private float lado1;
	private float lado2;
	private float lado3;
	private String nombre;
	private int id;
	private static int total;
	
	public Triangulo(String nombre, float base, float altura, float lado1, float lado2, float lado3) {
		super();
		total++;
		this.id=total;
		this.base = base;
		this.nombre = nombre;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}//constructor

	
	public float getBase() {
		return base;
	}



	public void setBase(float base) {
		this.base = base;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getLado1() {
		return lado1;
	}



	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}



	public float getLado2() {
		return lado2;
	}



	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}



	public float getLado3() {
		return lado3;
	}



	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}




	public String getNombre() {
		return nombre + " " + "#"+this.id;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float area() {
		return (getBase()*getAltura())/2; 
	}//area
	
	public float perimetro() {
		return (getLado1()+getLado2()+getLado3()); 
	}//area
	
}//class Triangulo
