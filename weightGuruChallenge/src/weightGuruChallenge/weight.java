package weightGuruChallenge;
import java.util.*;

public class weight {
	public static void main(String[] args) {
		System.out.println("Introduce tu estatura en m: ");
		Scanner heightAux = new Scanner (System.in);
		double height = heightAux.nextDouble();
		System.out.println("Introduce tu peso en kg: ");
		Scanner weightAux = new Scanner (System.in);
		double weight = weightAux.nextDouble();
		double IMC = weight / (height * height);
		System.out.println("Tu IMC es: " + IMC);
		
		if(IMC < 19) {
			System.out.println("Puede que est�s en desnutrici�n");
		}else if((IMC >= 19) && (IMC <=25)) {
			System.out.println("Est�s saludable seg�n la relaci�n de tu peso con tu estatura");
		}else if((IMC > 25) && (IMC <= 30)){
			System.out.println("Puede que est�s en sobrepeso");
		}else if(IMC > 30){
			System.out.println("Puede que est�s en obesidad");
		}
	}
}
