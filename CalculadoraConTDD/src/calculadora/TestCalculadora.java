package calculadora;

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

}
