
public class testCalculos {
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Tri�ngulo",10,20,3,2,1);
		Calculos.calc(t1);
		Triangulo t2 = new Triangulo("Tri�ngulo",5,10,3,2,1);
		Calculos.calc(t2);
		
		Cuadrado c1 = new Cuadrado("Cuadrado #1",25);
		Rectangulo r1 = new Rectangulo("Rect�ngulo #1",2,4);
		Calculos.calc(c1);
		Calculos.calc(r1);
	}//main

}//class testCalculos
