package Conversor;

import javax.swing.JOptionPane;

public class ConversoresUtil {
	private String ConversorSelecionado, Nlong1, Nlong2;
	private int Conversor, ConversorU, ConversorA, ConversorB, ConversorC, Long1, Long2;
	private double ValorInicial, temp, Valor, Resultado, longF;
	
	Conversor C = new Conversor();
	ConversorMoneda MonedaC = new ConversorMoneda();
	ConversorTemperatura TemperaturaC = new ConversorTemperatura();
	ConversorLongitudes LongitudesC = new ConversorLongitudes();
	ValorUtil valorU=new ValorUtil();
	

	
	//Este metodo pregunta al usuari si de verdad quiere salir
	public void Seguro() {
	//Se declara un option pane de tipo int para obtener las respuestas del usuario
	//dentro del mismo JOptionPane se declaran las palabras correspondeintes de los botones
		int dialogoSeguro = JOptionPane.showOptionDialog(null, "Estas seguro?", "Saliendo!", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] { "Si", "No"},  JOptionPane.YES_OPTION);
		//Si el usuario dice que si el programa invoca el metodo salida
		if (dialogoSeguro == JOptionPane.YES_OPTION) {
			Salida();
		}
		//Si el usuario dice que no volvemos al metodo SI_NO_Opcion
		else if (dialogoSeguro == JOptionPane.NO_OPTION) {
			SI_NO_Opcion(ConversorU);
		}
		//Si se presiona el boton X el programa se cierra.
		else {
			Salida();
		}
		
	}

	//El metodo Salida muestra el mensaje final antes de cerrar el programa
	public void Salida() {
		int Salida =JOptionPane.showConfirmDialog(null, "Programa Finalizado", "Fin", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE); 
		System.exit(0);
	}
	
	//Con esto le damos el valor a la variable Conversor para determinar que conversor vamos a utilizar
	public void setConversor(int conversor) {
		Conversor = conversor;
		this.ConversorU=Conversor;
		System.out.println(ConversorU);
	}
	
	//Este metodo invocara el conversor a usar dependiendo de la slección del usuario en la clase conversor
	public int getConversor() {
	//Usando el switch vamos a invocar el metodo correspondiente al conversor a usar
		switch (Conversor) {
		case 0:
			MonedaC.ConversorMonedas();
			break;
		case 1:
			TemperaturaC.ConversorTemperaturas();
			break;
		case 2:
			LongitudesC.ConversorLongitudes();
			break;
		case 3:
			TemperaturaC.ConversorTemperaturas();
			break;
		}
		return Conversor;
	}

	//Asignamos un valor a este metodo para asignarle un valor a la variable Valor
	public void setValor(double valor) {
		Valor = valor;
	}
	
	public void setValorI(double valorI) {
		ValorInicial = valorI;
	}
	
	public void setLong1(int long1, String nlong1) {
		Long1 = long1;
		Nlong1 = nlong1;
	}
	
	public void setLong2(int long2, String nlong2) {
		Long2 = long2;
		Nlong2 = nlong2;
	}
	
	public double setLongF(double longF) {
		return this.longF = longF;
	}
	
	
	//Usamos un SYSOUT para verificar que el valor recibido sea correcto
	public double getValor() {
		return Valor;
	}
		
	//Con este metodo asignamos valores a las variables conversorA y conversorSelecionado
	public void setConversorA(int conversorA, String conversorSelecionado) {
		this.ConversorA = conversorA;
		this.ConversorSelecionado = conversorSelecionado;
	}
	
	public int getConversorA() {
		switch (ConversorA) {
		case 0:
			valorU.setValor(Valor*0.0584242);
			Valor= valorU.getResultado();
			JOptionPane.showMessageDialog(null, "Tienes : $"+Valor +" dolares", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1:
			valorU.setValor(Valor*0.0532664);
			Valor= valorU.getResultado();
			JOptionPane.showMessageDialog(null, "Tienes : €"+Valor+" euros", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			valorU.setValor(Valor*0.0454960);
			Valor= valorU.getResultado();
			JOptionPane.showMessageDialog(null, "Tienes :  £"+Valor+" libras", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			valorU.setValor(Valor*8.30334);
			Valor= valorU.getResultado();
			JOptionPane.showMessageDialog(null, "Tienes : ¥"+Valor+" yenes", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			valorU.setValor(Valor*75.8183);
			Valor= valorU.getResultado();
			System.out.println(ConversorSelecionado);
			JOptionPane.showMessageDialog(null, "Tienes : $"+Valor+" wones", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			valorU.setValor(Valor*17.1202);
			Valor= valorU.getResultado();
			JOptionPane.showMessageDialog(null, "Tienes : $"+Valor+" pesos", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6:
			valorU.setValor(Valor*18.7763);
			Valor= valorU.getResultado();
			JOptionPane.showMessageDialog(null, "Tienes : $"+Valor+" pesos", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 7:
			valorU.setValor(Valor*21.9839);
			Valor= valorU.getResultado();
			JOptionPane.showMessageDialog(null, "Tienes : $"+Valor+" pesos", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		} 
		return ConversorA;
	}
	
	public void setConversorB(int conversorB, String conversorSelecionado) {
		this.ConversorB = conversorB;
		this.ConversorSelecionado = conversorSelecionado;
	}
	
	public int getConversorB() {
		switch (ConversorB) {
		case 0:			
			valorU.setValor(Valor);
			Valor=valorU.getResultado();
			JOptionPane.showMessageDialog(null, ValorInicial + " grados celsius son: "+Valor +" grados fahrenheit", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1:
			valorU.setValor(Valor);
			Valor=valorU.getResultado();
			JOptionPane.showMessageDialog(null, ValorInicial + " grados fahrenheit son: "+Valor+" grados celsius", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			valorU.setValor(Valor);
			Valor=valorU.getResultado();
			JOptionPane.showMessageDialog(null, ValorInicial + " grados celsius son: "+Valor +" grados kelvin", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			valorU.setValor(Valor);
			Valor=valorU.getResultado();
			JOptionPane.showMessageDialog(null, ValorInicial + " grados kelvin son: "+Valor +" grados celsius", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			valorU.setValor(Valor);
			Valor=valorU.getResultado();
			JOptionPane.showMessageDialog(null, ValorInicial + " grados fahrenheit son: "+Valor +" grados kelvein", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			valorU.setValor(Valor);
			Valor=valorU.getResultado();
			JOptionPane.showMessageDialog(null, ValorInicial + " grados kelvin son: "+Valor +" grados fahrenheit", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6:
			valorU.setValor(Valor);
			Valor=valorU.getResultado();
			JOptionPane.showMessageDialog(null, ValorInicial + " grados celsius son: "+Valor +" grados fahrenheit", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 7:
			valorU.setValor(Valor);
			Valor=valorU.getResultado();
			JOptionPane.showMessageDialog(null, ValorInicial + " grados celsius son: "+Valor +" grados fahrenheit", ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		return ConversorB;
	}
	
	public void setConversorC(int conversorC, String conversorSelecionado) {
		this.ConversorC = conversorC;
		this.ConversorSelecionado = conversorSelecionado;
	}
	
	public int getConversorC() {
		if(Long1==Long2){
			Resultado=Valor;
			JOptionPane.showMessageDialog(null, "Los conversores seleccionados son los mismos, por lo cual el valor de "+Resultado+" "+
			Nlong1.toLowerCase()+" es "+Resultado+" "+Nlong1.toLowerCase(), ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		} else if(Long1!=Long2 && Long1 <7 && Long2<7) {
			if(this.Long1<Long2) {
				Resultado=(Valor*(Math.pow(10, (Long2-Long1))));
				System.out.println(String.format("%.10f", Resultado));
				JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*1000000d)/100000++" "+Nlong2.toLowerCase(), 
						ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
				
			}else if (Long1>Long2) {
				Resultado=(Valor/(Math.pow(10, (Long1-Long2))));
				System.out.println(String.format("%.10f", Resultado));
				JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*1000000d)/100000++" "+Nlong2.toLowerCase(), 
						ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
			}
		} 
		else if(Long1==7 && Long2<7) {
			Resultado=(Valor*(1.609344006*(Math.pow(10,(Long2)))));
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*1000000d)/100000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1<7 && Long2==7) {
			Resultado=(Valor/(1.609344006*(Math.pow(10,(Long1)))));
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*1000000d)/100000 +" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==8 && Long2<7) {
			Resultado=(Valor*(0.0009144*(Math.pow(10,(Long2)))));
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1<7 && Long2==8) {
			Resultado=(Valor/(0.0009144*(Math.pow(10,(Long1)))));
			System.out.println(Long2);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==9 && Long2<7) {
			Resultado=(Valor*(0.0003048*(Math.pow(10,(Long2)))));
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1<7 && Long2==9) {
			Resultado=(Valor/(0.0003048*(Math.pow(10,(Long1)))));
			System.out.println(Long2);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==10 && Long2<7) {
			Resultado=(Valor*(0.0000254*(Math.pow(10,(Long2)))));
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*1000000d)/100000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1<7 && Long2==10) {
			Resultado=(Valor/(0.0000254*(Math.pow(10,(Long1+1)))));
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*1000000d)/100000 +" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==11 && Long2<7) {
			Resultado=(Valor*(1.852*(Math.pow(10,(Long2-1)))));
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*1000000d)/100000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1<7 && Long2==11) {
			Resultado=(Valor/(1.852*(Math.pow(10,(Long1+1)))));
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*1000000d)/100000 +" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//Millas a yardas y yardas a millas
		else if(Long1==7 && Long2==8) {
			Resultado=(Valor*1760);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*100000d)/1000000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==8 && Long2==7) {
			Resultado=(Valor/1760);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*100000d)/1000000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//millas a pies y pies a millas
		else if(Long1==7 && Long2==9) {
			Resultado=(Valor*5280);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*100000d)/1000000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==9 && Long2==7) {
			Resultado=(Valor/5280);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*100000d)/1000000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//millas a pulgadas y pulgadas a millas
		else if(Long1==7 && Long2==10) {
			Resultado=(Valor*63360);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==10 && Long2==7) {
			Resultado=(Valor/63360);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//millas a millas nauticas y millas nauticas a millas
		else if(Long1==7 && Long2==11) {
			Resultado=(Valor/1.151);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*100000d)/1000000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==11 && Long2==7) {
			Resultado=(Valor*1.151);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+(double)Math.round(Resultado*100000d)/1000000+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//yarda a pie y pie a yarda
		else if(Long1==8 && Long2==9) {
			Resultado=(Valor*3);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==9 && Long2==8) {
			Resultado=(Valor/3);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//yarda a pulgada y pulgada a yarda
		else if(Long1==8 && Long2==10) {
			Resultado=(Valor*36);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==10 && Long2==8) {
			Resultado=(Valor/36);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//yarda a milla n y milla n a yarda
		else if(Long1==8 && Long2==11) {
			Resultado=(Valor/1760);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==11 && Long2==8) {
			Resultado=(Valor*1760);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//pie a pulgada y pulgada a pie
		else if(Long1==9 && Long2==10) {
			Resultado=(Valor*12);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==10 && Long2==9) {
			Resultado=(Valor/12);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//pie a milla n y milla n a pie
		else if(Long1==9 && Long2==11) {
			Resultado=(Valor/6076);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==11 && Long2==9) {
			Resultado=(Valor*6076);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		//pulgada a milla n y milla n a pulgada
		else if(Long1==10 && Long2==11) {
			System.out.println(Valor);
			Resultado=(Valor/72910);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		else if(Long1==11 && Long2==10) {
			Resultado=(Valor*72910);
			System.out.println(Resultado);
			JOptionPane.showMessageDialog(null, Valor+" "+Nlong1.toLowerCase()+" equivalen a "+Resultado+" "+Nlong2.toLowerCase(), 
					ConversorSelecionado, JOptionPane.INFORMATION_MESSAGE);
		}
		return ConversorC;
	}


	public double getResultado() {
		return Resultado;
	}
	
	public void setResultado(double resultado) {
		Resultado = resultado;
	}
	//Este metodo nos ayudan a mostar el panel que pregunta si quiere continuar o no
	public void SI_NO_Opcion(int conversor) {
		int respuesta = JOptionPane.showOptionDialog(null, "Deseas continuar?", "Reiniciar", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] { "Si", "No", "Cancelar"}, 
				JOptionPane.YES_OPTION);
	//Usamos los if para volver al metodo correspondiente dependiendo del conversor que se esta usando
		if (respuesta == JOptionPane.YES_OPTION && conversor == 0) {
			MonedaC.ConversorMonedas();
		}else if (respuesta == JOptionPane.YES_OPTION && conversor ==1) {
			TemperaturaC.ConversorTemperaturas();
		}
		else if (respuesta == JOptionPane.YES_OPTION && conversor ==2) {
			LongitudesC.ConversorLongitudes();
		}
		//Si se presiona el boton no invoca el metodo que pregunta si esta seguro de salir
		else if (respuesta == JOptionPane.NO_OPTION) {
			Salida();
		}
		//Si se presiona el boton X el programa se cierra.
		else {
			System.exit(0);
		}
		ConversorU=conversor;
	}


}

