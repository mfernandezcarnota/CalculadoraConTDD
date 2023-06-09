package calculadora;

public class Calculadora {
  
      Metodos calcu = new Metodos();
		  try (Scanner entrada = new Scanner(System.in)) {
			double operando1, operando2, radicando, exponente, resultado;
			int opcion;
			boolean op = true;
			while(op) {
				
				System.out.println("************************");
				System.out.println("Menú.");
				System.out.println("1. Sumar.");
				System.out.println("2. Restar.");
				System.out.println("3. Multiplicar.");
				System.out.println("4. Dividir.");
				System.out.println("5. Raíz cuadrada.");
				System.out.println("6. Función exponencial con base e.");
				System.out.println("7. Salir.");
				
				System.out.println("Por favor, seleccione una opción.");
				opcion = entrada.nextInt();
				
				if (opcion == 7) {
					System.out.println("Saliendo de la calculadora.");
					break;
				} else {
					switch (opcion) {

}
