package Conversor;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	String cantidad;
	double  Valor, ValorConverso;

	public void ConversorMonedas() {
		ConversorMoneda intentar_de_nuevo = new ConversorMoneda();
		// Llamamos a Conversores Util
		ConversoresUtil CU = new ConversoresUtil();
		Conversor Con = new Conversor();
		// Menú de converor de monedas
		Object[] monedas = { "Peso Mexicano a Dólar", "Peso Mexicano a Euros", "Peso Mexicano a Libras Esterlinas",
				"Peso Mexicano a Yen Japonés", "Peso Mexicano a Won sul-coreano", "Dólar a Peso Mexicano",
				"Euro a Peso Mexicano", "Libras Esterlinas a Peso Mexicano" };
		//Usamos un try catch para los errores que se pueden presentar si no se ingresan valores de tipo double
		try{
			cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");

			Valor = Double.parseDouble(cantidad);
			Object opcion = JOptionPane.showInputDialog(null, "Selecciona la moneda a convertir", "Monedas",
			JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);
			for (int contador = 0, maxContador = monedas.length; contador < maxContador; contador++) {
				if (monedas[contador].equals(opcion)) { 
					System.out.println(Valor);
					CU.setValor(Valor);
					CU.setConversorA(contador, String.valueOf(opcion));
					CU.getConversorA();
					//Le enviamos un valor a el metodo si no opcion para indicarle desde que conversor se inicio
					CU.SI_NO_Opcion(0);
				}
			}
		//Este catch nos sirve para mostar un mensaje de error si no se ingreso un dato valido	
		} catch (NumberFormatException nfe) {
			JOptionPane.showConfirmDialog(null, "Por favor, ingresa un valor numerico valido", "Advertencia", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			intentar_de_nuevo.ConversorMonedas();
		} 
		//Este catch sirve para preguntarle al usuario si quiere salir del programa si presino el boton X
		catch (NullPointerException npe) {
			Con.Inicio();
		}
	}
}
