package Conversor;

import javax.swing.JOptionPane;

public class ConversorLongitudes {
	static String cantidad;
	static double LongitudU,ValorConverso;
	static int longitud1, longitud2;

	public void ConversorLongitudes(){
		Conversor C = new Conversor();
		ConversorTemperatura intentar_de_nuevo = new ConversorTemperatura();
		// Llamamos a Conversores Util
		ConversoresUtil CU = new ConversoresUtil();
		Conversor Con = new Conversor();
		
		// Menú de converor de longitudes
		Object[] longitudes = { 
				"Kilómetros",
				"Hectometros",
				"Decametros",
				"Metros",
				"Decimetro",
				"Centimetros",
				"Milimetros",
				//7
				"Millas",
				//8
				"Yardas",
				//9
				"Pies",
				//10
				"Pulgadas",
				//11
				"Millas Nauticas"
				};

		// Obtencion del valor a convertir en la temperatura seleccionada
		Object opcion1 =JOptionPane.showInputDialog(null, "Selecciona el tipo de longitud a que quieres convertir", "Longitud inical",JOptionPane.QUESTION_MESSAGE, null, longitudes, longitudes[0]);
		CU.setValor(LongitudU);
		for (int contador = 0, maxContador = longitudes.length; contador < maxContador; contador++) {		
			if (longitudes[contador].equals(opcion1)) { 
				CU.setLong1(contador, String.valueOf(opcion1));
			}
		}
					
		try {
			
			cantidad = JOptionPane.showInputDialog("Ingrese el valor de la longitud que deseas convertir");
			LongitudU = Double.parseDouble(cantidad);
			CU.setValor(LongitudU);
		//Este catch nos sirve para mostar un mensaje de error si no se ingreso un dato valido	
		} catch (NumberFormatException nfe) {
			JOptionPane.showConfirmDialog(null, "Por favor, ingresa un valor numerico valido", "Advertencia", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			intentar_de_nuevo.ConversorTemperaturas();
		} 
		//Este catch sirve para preguntarle al usuario si quiere salir del programa si presino el boton X
		catch (NullPointerException npe) {
			Con.Inicio();
		}
		
		Object opcion2 =JOptionPane.showInputDialog(null, "Selecciona el tipo de longitud a convertir", "Longitud final",
				JOptionPane.QUESTION_MESSAGE, null, longitudes, longitudes[0]);
				for (int contador2 = 0, maxContador = longitudes.length; contador2 < maxContador; contador2++) {
					if(longitudes[contador2].equals(opcion2)) {								
						CU.setLong2(contador2, String.valueOf(opcion2));
						CU.getConversorC();
					}	
				}
		CU.SI_NO_Opcion(2);
	}
}
