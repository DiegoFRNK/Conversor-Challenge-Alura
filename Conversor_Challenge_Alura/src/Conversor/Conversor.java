package Conversor;
import javax.swing.JOptionPane;
public class Conversor {
	//Creamos el metodo main para dar inicio a la aplicación
	public static void main(String[] args) {
		Inicio();
	}
	
	public static void Inicio() {
		//Creamos objetos de clase para poder llamar a los metodos de las clases correspondientes
		ConversoresUtil CU = new ConversoresUtil();
		ConversorTemperatura CT = new ConversorTemperatura();
		// Declaramos un objeto que contendra un arreglo, con este arreglo podremos mostrar opciones en el JOptionPane
		Object [] menuI ={
				"Conversor de monedas",
			    "Conversor de temperatura",
			    "Conversor de longitudes"
		}; 
	
		try {

			//Una vez que inicia el programa mostramos el Menu inicial 
			//Mostaremos el pamnel de opcion pero le damos un valor de tipo objeto  
			Object opcionMI = JOptionPane.showInputDialog(null,"Selecciona el conversor a usar", "Elegir",
					/*Aquí le indicamos al panel de opcion los objetos (opciones) que va a mostrar y cual se va a mostrar por defecto*/
					JOptionPane.PLAIN_MESSAGE,null,menuI, menuI[0]);
			//Con un ciclo for vamos a recorrer el objeto menuI para obtener el valor de posición del arreglo que el usuario selecciono 
			for(int contador = 0, maxContador = menuI.length;contador<maxContador;contador++){
				if (menuI[contador].equals(opcionMI)) {	
			/*	Con switch vamos a colocar los valores correspondientes en los metodos set
			 *	Y con los metodos get invocamos los valores correspondientes
			 */
					switch (contador) {
					case 0:
						CU.setConversor(contador);
						CU.getConversor();
					case 1:
						CU.setConversor(contador);
						CU.getConversor();
					case 2:
						CU.setConversor(contador);
						CU.getConversor();
					case 3:
						CU.setConversor(contador);
						CU.getConversor();
					}
				}
			}
		}catch (NullPointerException npe) {
			System.exit(0);
		}
	}	
}
