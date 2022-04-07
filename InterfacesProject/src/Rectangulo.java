
public class Rectangulo implements FiguraGeometrica{
	private float base;
	private float altura;
	private String nombre;
	
	public Rectangulo(String nombre, float base, float altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
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
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return (2*altura)+(2*base);
	}

}//class Rectangulo
