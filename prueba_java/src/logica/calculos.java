
package logica;

public class calculos {
public long factorial(long n){
	 if (n < 0) {
        throw new IllegalArgumentException("No se permite calcular el factorial de un número negativo.");
    }

    long result = 1;
    for (int i = 1; i <= n; i++) {
        if (result > Long.MAX_VALUE / i) {
            throw new ArithmeticException("El resultado del factorial excede la capacidad del tipo long.");
        }
        result *= i;
        
    }
    return result;
    }
    public double division(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Error: división por cero.");
   }
		return dividendo/divisor;
}
    
    private long factorialS(int n) {
		return 0;
	}

    public long combinatoria(int n, int s) {
   	
        long numerador = factorialS(n);
        long denominador = factorialS(s) * factorialS(n - s);
        if (n < 0 || s < 0 || s > n) {
            throw new IllegalArgumentException("Los valores de n y s  no deben ser negativos y s no puede ser mayor que n");
        }
        return numerador / denominador;
    }
	
    
    
}