package Conversor;

import javax.swing.JOptionPane;

public class ConversorTemperatura{
	static String cantidad;
	static double temperaturaU,ValorConverso;
	Conversor C = new Conversor();
	public void ConversorTemperaturas(){
		ConversorTemperatura intentar_de_nuevo = new ConversorTemperatura();
		// Llamamos a Conversores Util
		ConversoresUtil CU = new ConversoresUtil();
		Conversor Con = new Conversor();
		// Menú de converor de monedas
		Object[] temperaturas = { "Celsius a Fahrenheit",
				"Fahrenheit a Celsius",
				"Celsius a Kelvin",
				"Kelvin a Celsius",
				"Fahrenheit a Kelvin",
				"kelvin a Fahrenheit"
				};

		try {
			// Obtencion del valor a convertir en la temperatura seleccionada
			cantidad = JOptionPane.showInputDialog("Ingrese el valor de la teperatura que desea convertir");
			
			temperaturaU = Double.parseDouble(cantidad);
			
			Object opcion =JOptionPane.showInputDialog(null, "Selecciona la temperatura a convertir", "Temperaturas",
			JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]);
			
			for (int contador = 0, maxContador = temperaturas.length; contador < maxContador; contador++) {
				
				if (temperaturas[contador].equals(opcion)) { 
					for(Temperaturas temp : Temperaturas.values()) {
						if(Integer.valueOf(contador)==temp.ordinal()) {
							ValorConverso =temp.getTempU();
							CU.setValorI(temperaturaU);
							CU.setValor(ValorConverso);
							CU.setConversorB(contador, String.valueOf(opcion));
							CU.getConversorB();
							CU.SI_NO_Opcion(1);
						}
					}
				}
			}
		//Este catch nos sirve para mostar un mensaje de error si no se ingreso un dato valido	
		} catch (NumberFormatException nfe) {
			JOptionPane.showConfirmDialog(null, "Por favor, ingresa un valor numerico valido", "Advertencia", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			intentar_de_nuevo.ConversorTemperaturas();
		} 
		//Este catch sirve para preguntarle al usuario si quiere salir del programa si presino el boton X
		catch (NullPointerException npe) {
			Con.Inicio();
		}
	}
	
	
	public enum Temperaturas {
		CELSIUSFAHRENHEIT (((temperaturaU*9/5)+32)),
		FAHRENHEITCELCIUS (((temperaturaU-32)*5/9)),
		CELSIUKELVIN (((temperaturaU)+273.15)),
		KELVINCELCIUS(((temperaturaU)-273.15)),
		FAHRENHEITKELVIN((((temperaturaU-32)*5/9)+273.15)),
		KELVINFAHRENHEIT(((((temperaturaU)-273.15)*9/5)+32));

	 	private final double tempU;
	 	
		Temperaturas(double tempU) {
			this.tempU=tempU;
		}
		public double getTempU() { 
			return tempU;
			}
	}
}
