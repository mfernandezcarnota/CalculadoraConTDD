package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculadora {
  	@Test
	public void sumarDeberiaDevolverElValorEsperadoCuandoLosOperandosSonValidos() {
		/* El nombre del metodo se divide en un parte con el nombre del metodo,
		 * que es lo que se espera cuando el test es un exito,
		 * cuando se debe producir ese exito
		 */
		
		/*Paso 1: crear y configurar los objetos necesarios para ejecutar el test*/
		double operando_1 = 5.0000;
		double operando_2 = 5.1234;
		double valor_esperado = 10.1234;
		
		Metodos calcu = new Metodos();
				
		/*Ejecutar el metodo testeado*/
		double resultado = calcu.sumar(operando_1,operando_2);
		System.out.println("El resultado de la prueba sumar es: " + resultado +
				" y el valor esperado es: " + valor_esperado);
		/*Comprobar que el resultado obtenido es igual al resultado esperado po el test*/
		assertEquals("Resultado de la suma debería ser igual al valor esperado",
				valor_esperado, resultado, 0.0000);
	}
	
	@Test
	public void restarDeberiaDevolverElValorEsperadoCuandoLosOperandosSonValidos() {
		/* El nombre del metodo se divide en un parte con el nombre del metodo,
		 * que es lo que se espera cuando el test es un exito,
		 * cuando se debe producir ese exito
		 */
		
		/*Paso 1: crear y configurar los objetos necesarios para ejecutar el test*/
		double operando_1 = 10.0000;
		double operando_2 = 5.1234;
		double valor_esperado = 4.8766;
		
		Metodos calcu = new Metodos();
				
		/*Ejecutar el metodo testeado*/
		double resultado = calcu.restar(operando_1, operando_2);
		System.out.println("El resultado de la prueba restar es: " + resultado +
				" y el valor esperado es: " + valor_esperado);
		/*Comprobar que el resultado obtenido es igual al resultado esperado po el test*/
		assertEquals("Resultado de la resta debería ser igual al valor esperado",
				valor_esperado, resultado, 0.0000);
	}
	
	@Test
	public void multiplicarDeberiaDevolverElValorEsperadoCuandoLosOperandosSonValidos() {
		/* El nombre del metodo se divide en un parte con el nombre del metodo,
		 * que es lo que se espera cuando el test es un exito,
		 * cuando se debe producir ese exito
		 */
		
		/*Paso 1: crear y configurar los objetos necesarios para ejecutar el test*/
		double operando_1 = 5.0000;
		double operando_2 = 5.1234;
		double valor_esperado = 25.617;
		
		Metodos calcu = new Metodos();
				
		/*Ejecutar el metodo testeado*/
		double resultado = calcu.multiplicar(operando_1, operando_2);
		System.out.println("El resultado de la prueba multiplicar es: " + resultado +
				" y el valor esperado es: " + valor_esperado);
		/*Comprobar que el resultado obtenido es igual al resultado esperado po el test*/
		assertEquals("Resultado de la multiplicación debería ser igual al valor esperado",
				valor_esperado, resultado, 0.0000);
	}
	
	@Test
	public void dividirDeberiaDevolverElValorEsperadoCuandoLosOperandosSonValidos() {
		/* El nombre del metodo se divide en un parte con el nombre del metodo,
		 * que es lo que se espera cuando el test es un exito,
		 * cuando se debe producir ese exito
		 */
		
		/*Paso 1: crear y configurar los objetos necesarios para ejecutar el test*/
		double operando_1 = 15.45;
		double operando_2 = 100;
		double valor_esperado = 0.1545;
		
		Metodos calcu = new Metodos();
				
		/*Ejecutar el metodo testeado*/
		double resultado = calcu.dividir(operando_1,operando_2);
		System.out.println("El resultado de la prueba dividir es: " + resultado +
				" y el valor esperado es: " + valor_esperado);
		/*Comprobar que el resultado obtenido es igual al resultado esperado por el test*/
		assertEquals("Resultado de la división debería ser igual al valor esperado",
				valor_esperado, resultado, 0.0000);
	}
	
	@Test
	public void raizCuadradaDeberiaDevolverElValorEsperadoCuandoLosOperandosSonValidos() {
		/* El nombre del metodo se divide en un parte con el nombre del metodo,
		 * que es lo que se espera cuando el test es un exito,
		 * cuando se debe producir ese exito
		 */
		
		/*Paso 1: crear y configurar los objetos necesarios para ejecutar el test*/
		double valor_raiz = 4;
		double valor_esperado = 2;
		
		Metodos calcu = new Metodos();
				
		/*Ejecutar el metodo testeado*/
		double resultado = calcu.raiz(valor_raiz);
		System.out.println("El resultado de la prueba raiz es: " + resultado +
				" y el valor esperado es: " + valor_esperado);
		/*Comprobar que el resultado obtenido es igual al resultado esperado por el test*/
		assertEquals("Resultado de la raíz cuadrada debería ser igual al valor esperado",
				valor_esperado, resultado, 0.0000);
	}
	
	@Test
	public void potenciaBaseEDeberiaDevolverElValorEsperadoCuandoLosOperandosSonValidos() {
		/* El nombre del metodo se divide en un parte con el nombre del metodo,
		 * que es lo que se espera cuando el test es un exito,
		 * cuando se debe producir ese exito
		 */
		
		/*Paso 1: crear y configurar los objetos necesarios para ejecutar el test*/
		double exponente = 2;
		double valor_esperado = 7.387524;
		
		Metodos calcu = new Metodos();
				
		/*Ejecutar el metodo testeado*/
		double resultado = calcu.potenciaBaseE(exponente);
		System.out.println("El resultado de la prueba potenciaBaseE es: " + resultado +
				" y el valor esperado es: " + valor_esperado);
		/*Comprobar que el resultado obtenido es igual al resultado esperado por el test*/
		assertEquals("Resultado de la potencia en base e debería ser igual al valor esperado",
				valor_esperado, resultado, 0.0000);
	}

}
