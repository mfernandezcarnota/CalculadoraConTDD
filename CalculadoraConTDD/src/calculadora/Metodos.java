package calculadora;

public class Metodos {
  	public double sumar(double operando1, double operando2) {
		double resultado = 0.000;
		resultado = operando1 + operando2;
		
		return resultado;
	}
	
	public double restar(double operando1, double operando2) {
		double resultado = 0.000;
		resultado = operando1 - operando2;
		return resultado;
	}
	
	public double multiplicar(double operando1, double operando2) {
		double resultado = 0.000;
		resultado = operando1 * operando2;
		return resultado;
	}
	
	public double dividir(double operando1, double operando2) {
		double resultado = 0.000;
		resultado = operando1 / operando2;
		return resultado;
	}
	
	public double raiz(double radicando) {		
		double t;
		double raizCuadrada = radicando / 2;
		
		do {
			t = raizCuadrada;
			raizCuadrada = (t + (radicando / 2)) / 2;
		} while ((t - raizCuadrada) != 0);
		return raizCuadrada;
	}
}
