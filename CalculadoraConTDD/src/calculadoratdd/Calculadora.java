package calculadoratdd;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Metodos calcu = new Metodos();
		try (Scanner entrada = new Scanner(System.in)) {
			double operando1, operando2, radicando, exponente, resultado;
			int opcion;
			boolean op = true;
			while(op) {
				
				System.out.println("************************");
				System.out.println("Men�.");
				System.out.println("1. Sumar.");
				System.out.println("2. Restar.");
				System.out.println("3. Multiplicar.");
				System.out.println("4. Dividir.");
				System.out.println("5. Ra�z cuadrada.");
				System.out.println("6. Funci�n exponencial con base e.");
				System.out.println("7. Salir.");
				
				System.out.println("Por favor, seleccione una opci�n.");
				opcion = entrada.nextInt();
				
				if (opcion == 7) {
					System.out.println("Saliendo de la calculadora.");
					break;
				} else {
					switch (opcion) {
						
					case 1:
						System.out.println("Introduzca el primer valor: ");
						operando1 = entrada.nextDouble();
						System.out.println("Introduzca el segundo valor: ");
						operando2 = entrada.nextDouble();
						resultado = calcu.sumar(operando1, operando2);
						System.out.println("El resultado de la suma es: " + resultado);
						break;
					
					case 2:
						System.out.println("Introduzca el primer valor: ");
						operando1 = entrada.nextDouble();
						System.out.println("Introduzca el segundo valor: ");
						operando2 = entrada.nextDouble();
						resultado = calcu.restar(operando1, operando2);
						System.out.println("El resultado de la resta es: " + resultado);
						break;
						
					case 3:
						System.out.println("Introduzca el primer valor: ");
						operando1 = entrada.nextDouble();
						System.out.println("Introduzca el segundo valor: ");
						operando2 = entrada.nextDouble();
						resultado = calcu.multiplicar(operando1, operando2);
						System.out.println("El resultado de la multiplicaci�n es: " + resultado);
						break;
						
					case 4:
						System.out.println("Introduzca el primer valor: ");
						operando1 = entrada.nextDouble();
						System.out.println("Introduzca el segundo valor: ");
						operando2 = entrada.nextDouble();
						resultado = calcu.dividir(operando1, operando2);
						System.out.println("El resultado de la divisi�n es: " + resultado);
						break;
						
					case 5:
						System.out.println("Introduzca el valor del radicando: ");
						radicando = entrada.nextDouble();
						resultado = calcu.raiz(radicando);
						System.out.println("El resultado de la divisi�n es: " + resultado);
						break;

					case 6:
						System.out.println("Introduzca el valor del exponente: ");
						exponente = entrada.nextDouble();
						resultado = calcu.raiz(exponente);
						System.out.println("El resultado del exponente con base e, es: " + resultado);
						break;
						
					default:
						System.out.println("La opci�n que ha elegido no es v�lida, por favor, vuelva"
								+ " a intentar.");
					}
				}
			}
		}
		
		
	}
	
}
