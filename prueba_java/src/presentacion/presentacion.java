package presentacion;
import logica.calculos;
public class presentacion {

	public static void main(String[] args) {
		
		
		calculos P= new calculos();
		
		long resultadoFac= P.factorial(5);
		System.out.println("El resultado es: "+resultadoFac);
		double resultadoDi= P.division(4, 2);
		System.out.println("El resultado es: "+resultadoDi);
		long resultadoC =P.combinatoria(5, 4);
		System.out.println("El resultado es: "+resultadoC);
	 
	

	}

}